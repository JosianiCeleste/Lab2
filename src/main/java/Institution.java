import java.util.List;

public class Institution {
    private String name;
    private List<Lab> labs;

    public boolean addLab( Lab lab){
        if(lab==null)
        {
            return false;
        }
        for (Lab l:labs)
        {
            return true;
        }
    }
    //region Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lab> getLabs() {
        return List.copyOf(labs);
    }

    public void setLabs(List<Lab> labs) {
        this.labs = labs;
    }
    //endregion
}
