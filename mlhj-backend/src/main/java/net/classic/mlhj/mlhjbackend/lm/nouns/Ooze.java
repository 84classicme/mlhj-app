package net.classic.mlhj.mlhjbackend.lm.nouns;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Ooze extends ArrayList<Noun> {

    public Ooze() {
        super.add(new Noun("sludge", "", "a"));
        super.add(new Noun("ooze", "", "an"));
        super.add(new Noun("slime", "", "a"));
        super.add(new Noun("decay", "", "a"));
        super.add(new Noun("putrefaction", "", "a"));
    }

}