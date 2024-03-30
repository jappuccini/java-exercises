package demo.java2.generics.specificteams;

import demo.generics.footballteam.FootballPlayer;
import demo.generics.footballteam.FootballTeam;
import demo.generics.hockeyteam.HockeyPlayer;
import demo.generics.hockeyteam.HockeyTeam;

public class Example {

    public static void main(String[] args) {

        HockeyTeam wildWings = new HockeyTeam("Wild Wings");
        wildWings.addPlayer(new HockeyPlayer("Mirco"));
        wildWings.printTeamName();
        wildWings.printPlayerNames();

        FootballTeam scFreiburg = new FootballTeam("Sc Freiburg");
        scFreiburg.addPlayer(new FootballPlayer("Steffen"));
        scFreiburg.printTeamName();
        scFreiburg.printPlayerNames();
    }
}
