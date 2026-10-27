import java.util.ArrayList;
import java.util.List;

public class Institution {
    private String name;
    private List<Lab> labs;

    public Institution(String name) {
        this.name = name;
        this.labs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Lab> getLabs() {
        return List.copyOf(labs);
    }

    public boolean addLab(Lab lab) {
        if (lab == null) {
            return false;
        }
        for (Lab l : labs) {
            if (l.getName().equals(lab.getName())) {
                return false; // Lab.name é único na Institution[cite: 1]
            }
        }
        labs.add(lab);
        return true;
    }
}