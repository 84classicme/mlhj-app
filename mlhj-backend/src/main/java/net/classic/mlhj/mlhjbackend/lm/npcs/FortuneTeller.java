package net.classic.mlhj.mlhjbackend.lm.npcs;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class FortuneTeller extends ArrayList<Noun> {

    public FortuneTeller() {
        super.add(new Noun("witch", "witches", "a"));
        super.add(new Noun("warlock", "warlocks", "a"));
        super.add(new Noun("soothsayer", "soothsayers", "a"));
        super.add(new Noun("diviner", "diviners", "a"));
        super.add(new Noun("seer", "seers", "a"));
        super.add(new Noun("presager", "presagers", "a"));
        super.add(new Noun("divinator", "divinators", "a"));
    }
}