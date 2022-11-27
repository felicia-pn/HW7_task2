import java.util.ArrayList;
import java.util.List;

public class LeafTeam implements OlympicTeam {
    private String name;
    private int athletes;
    private int gold;

    public LeafTeam(String s, int a, int g) {
        this.name = s;
        this.athletes = a;
        this.gold = g;
    }

    public String getName() {
        return name;
    }

    @Override
    public void printTeamSize() {
        System.out.println("Team: " + name + ", Number of Athletes " + athletes);
    }

    @Override
    public void printMedals() {
        System.out.println("Team: " + name+ ", Number of Medals "+ gold);
    }
}
