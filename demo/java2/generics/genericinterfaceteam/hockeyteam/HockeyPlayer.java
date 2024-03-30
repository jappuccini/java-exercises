package demo.java2.generics.genericinterfaceteam.hockeyteam;

import demo.java2.generics.genericinterfaceteam.Player;

public class HockeyPlayer implements Player {
    public final String name;

    public HockeyPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
