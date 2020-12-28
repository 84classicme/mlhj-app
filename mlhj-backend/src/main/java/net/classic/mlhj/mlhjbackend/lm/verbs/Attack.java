package net.classic.mlhj.mlhjbackend.lm.verbs;

import net.classic.mlhj.mlhjbackend.lm.Verb;

import java.util.ArrayList;

public class Attack extends ArrayList<Verb> {

    public Attack() {
        super.add(new Verb("attack", "attacked", "attacked"));
        super.add(new Verb("assault", "waylaid", "waylaid"));
        super.add(new Verb("assault", "assaulted", "assaulted"));
        super.add(new Verb("assail", "assailed", "assailed"));
    }
}
