package net.classic.mlhj.mlhjbackend.lm.npcs;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Nemesis extends ArrayList<Noun> {

    public Nemesis() {
        super.add(new Noun("nemesis", "nemeses", "a"));
        super.add(new Noun("adversary", "adversaries", "an"));
        super.add(new Noun("antagonist", "antagonists", "an"));
        super.add(new Noun("enemy", "enemies", "a"));
        super.add(new Noun("foe", "foes", "an"));
        super.add(new Noun("rival", "rivals", "a"));
    }
}