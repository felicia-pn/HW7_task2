public class Main {
    public static void main(String[] args) {

        CompositeTeam olympTeam = new CompositeTeam("OlympicTeam");

        CompositeTeam team1 = new CompositeTeam("Asia");
        CompositeTeam team2 = new CompositeTeam("Europe");
        CompositeTeam team3 = new CompositeTeam("Africa");
        CompositeTeam team4 = new CompositeTeam("South America");

        olympTeam.addSubTeam(team1);
        olympTeam.addSubTeam(team2);
        olympTeam.addSubTeam(team3);
        olympTeam.addSubTeam(team4);

        CompositeTeam team5 = new CompositeTeam("China");
        CompositeTeam team6 = new CompositeTeam("Afghanistan");

        team1.addSubTeam(team5);
        team1.addSubTeam(team6);

        CompositeTeam team7 = new CompositeTeam("Women");
        CompositeTeam team8 = new CompositeTeam("Men");

        team5.addSubTeam(team7);
        team5.addSubTeam(team8);

        LeafTeam team9 = new LeafTeam("Teakwondo", 13, 3);
        LeafTeam team10 = new LeafTeam("Waterpolo", 3, 1);
        LeafTeam team11 = new LeafTeam("Artistic Gymnastics", 8, 7);

        team7.addSubTeam(team9);
        team7.addSubTeam(team10);
        team7.addSubTeam(team11);

        LeafTeam team12 = new LeafTeam("Shooting", 4, 0);

        team8.addSubTeam(team12);

        CompositeTeam team13 = new CompositeTeam("Germany");
        CompositeTeam team14 = new CompositeTeam("Italy");

        team2.addSubTeam(team13);
        team2.addSubTeam(team14);

        CompositeTeam team15 = new CompositeTeam("Women");
        CompositeTeam team16 = new CompositeTeam("Men");

        team13.addSubTeam(team15);
        team13.addSubTeam(team16);

        LeafTeam team17 = new LeafTeam("Cycling", 25, 3);
        LeafTeam team18 = new LeafTeam("Tennis", 6,1);

        team15.addSubTeam(team17);
        team15.addSubTeam(team18);

        LeafTeam team19 = new LeafTeam("TableTennis", 8, 0);
        LeafTeam team20 = new LeafTeam("Football", 20, 0);

        team16.addSubTeam(team19);
        team16.addSubTeam(team20);
        /*
            a. NameoftheTeamsandNumber*ofAthletesofGermanyMen’sTeam
            b. NameoftheTeamsandNumber*ofGoldMedalsofGermany
            c. Name of the Teams and Number*of Gold Medals of Asia’s Team
            d. NameandNumber*ofathletesofteamsintheOlympic2024!
         */
        team16.printTeamSize();
        System.out.println("------");
        team13.printMedals();
        System.out.println("------");
        team1.printMedals();
        System.out.println("------");
        olympTeam.printTeamSize();


    }
}