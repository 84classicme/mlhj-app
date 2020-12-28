package net.classic.mlhj.mlhjbackend.lm.monsters;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Barbarian extends ArrayList<Noun> {

    public Barbarian() {
        super.add(new Noun("invader", "invaders", "an"));
        super.add(new Noun("marauder", "marauders", "a"));
        super.add(new Noun("reaper", "reapers", "a"));
        super.add(new Noun("barbarian", "barbarians", "a"));
        super.add(new Noun("raider", "raiders", "a"));
        super.add(new Noun("jackal", "jackals", "a"));
        super.add(new Noun("defiler", "defilers", "a"));
        super.add(new Noun("depredator", "depredators", "n"));
        super.add(new Noun("despoiler", "despoilers", "a"));
        super.add(new Noun("ravager", "brutes", "a"));
        super.add(new Noun("savage", "savages", "a"));
    }
}
