package net.classic.mlhj.mlhjbackend.lm.nouns;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Element extends ArrayList<Noun> {

    public Element(){
        super.add(new Noun("ice", "", "an"));
        super.add(new Noun("fire", "", "a"));
        super.add(new Noun("lightning", "", "a"));
        super.add(new Noun("thunder", "", "a"));
        super.add(new Noun("frost", "", "a"));
        super.add(new Noun("flame", "", "a"));
        super.add(new Noun("magma", "", "a"));
        super.add(new Noun("lava", "", "a"));
        super.add(new Noun("water", "", "a"));
        super.add(new Noun("earth", "", "an"));
    }
}
