package demo.java2.generics.genericinterfaceteam;

import demo.java2.generics.genericinterfaceteam.footballteam.FootballPlayer;
import demo.java2.generics.genericinterfaceteam.hockeyteam.HockeyPlayer;

public class Example {

    public static void main(String[] args) {
        Team<HockeyPlayer> wildWings = new Team<>("Wild Wings");
        wildWings.addPlayer(new HockeyPlayer("Mirco"));
        wildWings.printTeamName();
        wildWings.printPlayers();

        Team<FootballPlayer> scFreiburg = new Team<>("SC Freiburg");
        scFreiburg.addPlayer(new FootballPlayer("Steffen"));
        scFreiburg.printTeamName();
        scFreiburg.printPlayers();
    }
}
