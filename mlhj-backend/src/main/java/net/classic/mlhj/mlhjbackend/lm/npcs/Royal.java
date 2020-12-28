package net.classic.mlhj.mlhjbackend.lm.npcs;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Royal extends ArrayList<Noun> {

    public Royal() {
        super.add(new Noun("emperor", "emperors", "an"));
        super.add(new Noun("suzerain", "suzerains", "a"));
        super.add(new Noun("king", "kings", "a"));
        super.add(new Noun("queen", "queens", "a"));
        super.add(new Noun("knight", "knights", "a"));
        super.add(new Noun("lord", "lords", "a"));
        super.add(new Noun("lady", "ladies", "a"));
        super.add(new Noun("baron", "barons", "a"));
        super.add(new Noun("baroness", "baronesses", "a"));
        super.add(new Noun("count", "counts", "a"));
        super.add(new Noun("countess", "countesses", "a"));
        super.add(new Noun("duke", "dukes", "a"));
        super.add(new Noun("duchess", "duchesses", "a"));
        super.add(new Noun("marquis", "marquises", "a"));
        super.add(new Noun("marquise", "marquises", "a"));
    }
}