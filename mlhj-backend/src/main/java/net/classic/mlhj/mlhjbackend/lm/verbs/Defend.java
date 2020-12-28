package net.classic.mlhj.mlhjbackend.lm.verbs;

import net.classic.mlhj.mlhjbackend.lm.Verb;

import java.util.ArrayList;

public class Defend extends ArrayList<Verb> {

    public Defend() {
        super.add(new Verb("defend", "defended", "defended"));
        super.add(new Verb("guard", "guarded", "guarded"));
        super.add(new Verb("safeguard", "safeguarded", "safeguarded"));
        super.add(new Verb("protect", "protected", "protected"));
        super.add(new Verb("shelter", "sheltered", "sheltered"));
        super.add(new Verb("ward", "warded", "warded"));
        super.add(new Verb("shield", "shielded", "shielded"));
    }
}