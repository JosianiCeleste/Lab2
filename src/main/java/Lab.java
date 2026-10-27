import java.util.ArrayList;
import java.util.List;

public class Lab {
    private String name;
    private List<Computer> computers;

    public Lab(String name) {
        this.name = name;
        this.computers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Computer> getComputers() {
        return List.copyOf(computers);
    }

    public boolean addComputer(Computer c) {
        if (c == null) {
            return false;
        }
        for (Computer comp : computers) {
            if (comp.getId().equals(c.getId())) {
                return false; // Computer.id é único no Lab[cite: 1]
            }
        }
        computers.add(c);
        return true;
    }

    public Computer removeComputer(String id) {
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getId().equals(id)) {
                return computers.remove(i);
            }
        }
        return null;
    }

    public Computer findComputerById(String id) {
        for (Computer c : computers) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }
}