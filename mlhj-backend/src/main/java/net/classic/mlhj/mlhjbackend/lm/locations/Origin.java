package net.classic.mlhj.mlhjbackend.lm.locations;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Origin extends ArrayList<Noun> {

    public Origin() {
        super.add(new Noun("hut", "huts", "a"));
        super.add(new Noun("shack", "shacks", "a"));
        super.add(new Noun("tent", "tents", "a"));
        super.add(new Noun("cabin", "cabins", "a"));
        super.add(new Noun("hovel", "hovels", "a"));
        super.add(new Noun("shanty", "shanties", "a"));
    }
}
