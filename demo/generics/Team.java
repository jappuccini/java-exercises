package demo.generics;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String teamName;
    private ArrayList<T> players = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addPlayer(T player) {
        this.players.add(player);
    }

    public void printTeamName() {
        System.out.println(teamName);
    }

    public void printPlayers() {
        for (T player : players) {
            System.out.println(player.name());
        }
    }
}
