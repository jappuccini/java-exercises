package demo.java2.generics.genericinheritanceteam;

import demo.java2.generics.genericinheritanceteam.footballteam.FootballPlayer;
import demo.java2.generics.genericinheritanceteam.hockeyteam.HockeyPlayer;

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
