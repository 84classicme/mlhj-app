package net.classic.mlhj.mlhjbackend.lm.npcs;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Hermit extends ArrayList<Noun> {

    public Hermit() {
        super.add(new Noun("hermit", "hermits", "an"));
        super.add(new Noun("recluse", "recluses", "an"));
        super.add(new Noun("eremite", "eremites", "a"));
        super.add(new Noun("monk", "monks", "a"));
        super.add(new Noun("loner", "loners", "a"));
        super.add(new Noun("codger", "codgers", "a"));
        super.add(new Noun("outsider", "outsiders", "an"));
    }
}
