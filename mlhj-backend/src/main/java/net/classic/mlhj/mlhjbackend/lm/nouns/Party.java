package net.classic.mlhj.mlhjbackend.lm.nouns;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Party extends ArrayList<Noun> {

    public Party(){
        super.add(new Noun("celebration", "celebrations", "a"));
        super.add(new Noun("festival", "celebrations", "a"));
        super.add(new Noun("feast", "celebrations", "a"));
        super.add(new Noun("dance", "celebrations", "a"));
        super.add(new Noun("parade", "celebrations", "a"));
        super.add(new Noun("carnival", "celebrations", "a"));
        super.add(new Noun("celebration", "celebrations", "a"));
        super.add(new Noun("fest", "fests", "a"));
        super.add(new Noun("party", "parties", "a"));
    }
}
