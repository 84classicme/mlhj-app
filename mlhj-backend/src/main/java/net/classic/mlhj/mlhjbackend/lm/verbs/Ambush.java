package net.classic.mlhj.mlhjbackend.lm.verbs;

import net.classic.mlhj.mlhjbackend.lm.Verb;

import java.util.ArrayList;

public class Ambush extends ArrayList<Verb> {

    public Ambush() {
        super.add(new Verb("ambush", "ambushed", "ambushed"));
        super.add(new Verb("waylay", "waylaid", "waylaid"));
        super.add(new Verb("trap", "trapped", "trapped"));
        super.add(new Verb("surprise", "surprised", "surprised"));
    }
}
