import java.util.ArrayList;
import java.util.List;

public class CompositeTeam implements OlympicTeam {

    private List<OlympicTeam> subTeams = new ArrayList<OlympicTeam>();
    private String name;

    public CompositeTeam(String s) {
        this.name = s;
    }

    public void addSubTeam(OlympicTeam o) {
        subTeams.add(o);
    }

    public void removeSubTeam(OlympicTeam o) {
        for (int i = 0; i < subTeams.size(); i++) {
            if (subTeams.get(i) == o) {
                subTeams.remove(i);
            }
        }
    }

    @Override
    public void printTeamSize() {
        System.out.println(name + ":");
        for (OlympicTeam sub : subTeams) {
            sub.printTeamSize();
        }
    }
    @Override
    public void printMedals() {
        System.out.println(name + ":");
        for (OlympicTeam sub : subTeams) {
            sub.printMedals();
        }
    }


}
