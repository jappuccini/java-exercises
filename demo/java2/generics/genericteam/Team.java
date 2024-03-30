package demo.java2.generics.genericteam;

import java.util.ArrayList;

public class Team<T> {
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

    public void printPlayerNames() {
        for (T player : players) {
            System.out.println(player.name) // Problem
        }
    }

}
