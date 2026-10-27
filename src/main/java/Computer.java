import java.util.ArrayList;
import java.util.List;

public class Computer {
    private String id;
    private String brand;
    private List<Component> components;

    public Computer(String id, String brand) {
        this.id = id;
        this.brand = brand;
        this.components = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public List<Component> getComponents() {
        return List.copyOf(components);
    }

    public boolean addComponent(Component c) {
        if (c == null) {
            return false;
        }
        for (Component comp : components) {
            if (comp.getId().equals(c.getId())) {
                return false; // Component.id único entre os componentes de topo[cite: 1]
            }
        }
        components.add(c);
        return true;
    }

    public Component removeComponent(String id) {
        for (int i = 0; i < components.size(); i++) {
            if (components.get(i).getId().equals(id)) {
                return components.remove(i);
            }
        }
        return null;
    }

    public int countAllComponents() {
        int total = 0;
        for (Component c : components) {
            total += 1 + c.countDescendants();
        }
        return total;
    }
}