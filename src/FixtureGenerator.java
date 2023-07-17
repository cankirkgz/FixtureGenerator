import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixtureGenerator {
    private List<String> teams;
    private List<String> fixtures;

    public FixtureGenerator(List<String> teams) {
        this.teams = teams;
        this.fixtures = new ArrayList<>();
    }

    public void generateFixture() {
        int numTeams = teams.size();

        if (teams.size() % 2 == 1) {
            teams.add("Bay");
            numTeams++;
        }
        int numRounds = (numTeams - 1) * 2;
        int halfSize = numTeams / 2;

        List<String> teamsCopy = new ArrayList<>(teams);
        teamsCopy.remove(0); // Remove the first team (Galatasaray) temporarily for rotation

        for (int round = 0; round < numRounds; round++) {
            System.out.println("Round " + (round + 1));

            int teamIdx = round % (numTeams - 1);
            System.out.println(teams.get(0) + " vs " + teamsCopy.get(teamIdx));

            for (int i = 0; i < halfSize - 1; i++) {
                int firstTeam = (round + i) % (numTeams - 1);
                int secondTeam = (round + numTeams - i - 2) % (numTeams - 1);
                System.out.println(teamsCopy.get(firstTeam) + " vs " + teamsCopy.get(secondTeam));
            }
            System.out.println();
            Collections.rotate(teamsCopy, -1); // Rotate the teams for the next round
        }
    }
}
