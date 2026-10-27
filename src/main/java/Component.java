import java.util.ArrayList;
import java.util.List;

public class Component {
    private String id;
    private String name;
    private List<Component> parts;

    public Component(String id, String name) {
        this.id = id;
        this.name = name;
        this.parts = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Component> getParts() {
        return List.copyOf(parts);
    }

    public boolean addPart(Component child) {
        if (child == null) {
            return false;
        }
        // Prevenção de ciclos (um componente não pode conter a si próprio direta ou indiretamente)[cite: 1]
        if (child.getId().equals(this.id) || child.containsId(this.id)) {
            return false;
        }
        for (Component p : parts) {
            if (p.getId().equals(child.getId())) {
                return false; // Component.id único entre os filhos do mesmo componente[cite: 1]
            }
        }
        parts.add(child);
        return true;
    }

    public Component removePart(String childId) {
        for (int i = 0; i < parts.size(); i++) {
            if (parts.get(i).getId().equals(childId)) {
                return parts.remove(i);
            }
        }
        return null;
    }

    public boolean containsId(String targetId) {
        for (Component p : parts) {
            if (p.getId().equals(targetId) || p.containsId(targetId)) {
                return true;
            }
        }
        return false;
    }

    public int countDescendants() {
        int count = parts.size();
        for (Component p : parts) {
            count += p.countDescendants();
        }
        return count;
    }
}