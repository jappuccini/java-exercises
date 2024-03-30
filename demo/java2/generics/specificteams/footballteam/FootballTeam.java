package demo.java2.generics.specificteams.footballteam;

import java.util.ArrayList;

public class FootballTeam {
    private String teamName;
    private ArrayList<FootballPlayer> players = new ArrayList<>();

    public FootballTeam(String teamname) {
        this.teamName = teamname;
    }

    public void addPlayer(FootballPlayer player) {
        this.players.add(player);
    }

    public void printTeamName() {
        System.out.println(teamName);
    }

    public void printPlayerNames() {
        for (FootballPlayer footballPlayer : players) {
            System.out.println(footballPlayer.name);
        }
    }
}
