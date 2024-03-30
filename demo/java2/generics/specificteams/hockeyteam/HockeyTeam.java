package demo.java2.generics.specificteams.hockeyteam;

import java.util.ArrayList;

public class HockeyTeam {
    private String teamName;
    private ArrayList<HockeyPlayer> players = new ArrayList<>();

    public HockeyTeam(String teamname) {
        this.teamName = teamname;
    }

    public void addPlayer(HockeyPlayer player) {
        this.players.add(player);
    }

    public void printTeamName() {
        System.out.println(teamName);
    }

    public void printPlayerNames() {
        for (HockeyPlayer hockeyPlayer : players) {
            System.out.println(hockeyPlayer.name);
        }
    }
}
