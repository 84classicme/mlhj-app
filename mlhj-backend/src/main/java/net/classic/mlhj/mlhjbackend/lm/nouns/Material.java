package net.classic.mlhj.mlhjbackend.lm.nouns;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Material  extends ArrayList<Noun> {

    public Material(){
        super.add(new Noun("steel", "", "a"));
        super.add(new Noun("granite", "", "a"));
        super.add(new Noun("marble", "", "a"));
        super.add(new Noun("jade", "", "a"));
        super.add(new Noun("silver", "", "a"));
        super.add(new Noun("gold", "", "a"));
        super.add(new Noun("diamond", "", "a"));
        super.add(new Noun("copper", "", "a"));
        super.add(new Noun("brass", "", "a"));
    }
}
