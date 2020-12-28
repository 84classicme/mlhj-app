package net.classic.mlhj.mlhjbackend.lm.npcs;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Relative extends ArrayList<Noun> {

    public Relative() {
        super.add(new Noun("stepfather", "stepparents", "a"));
        super.add(new Noun("stepmother", "stepparents", "a"));
        super.add(new Noun("uncle", "uncles", "an"));
        super.add(new Noun("aunt", "aunts", "an"));
        super.add(new Noun("grandfather", "grandparents", "a"));
        super.add(new Noun("grandmother", "grandparents", "a"));
    }
}