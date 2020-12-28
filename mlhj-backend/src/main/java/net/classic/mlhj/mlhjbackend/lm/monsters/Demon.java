package net.classic.mlhj.mlhjbackend.lm.monsters;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Demon  extends ArrayList<Noun> {

    public Demon() {
        super.add(new Noun("fiend", "fiends", "a"));
        super.add(new Noun("demon", "demons", "a"));
        super.add(new Noun("daemon", "daemons", "a"));
        super.add(new Noun("devil", "devils", "a"));
        super.add(new Noun("balrog", "balrogs", "a"));
        super.add(new Noun("mogwai", "mogwai", "a"));
    }
}
