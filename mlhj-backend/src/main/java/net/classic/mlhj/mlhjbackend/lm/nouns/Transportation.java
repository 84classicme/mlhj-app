package net.classic.mlhj.mlhjbackend.lm.nouns;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Transportation extends ArrayList<Noun> {

    public Transportation() {
        super.add(new Noun("ship", "ships", "a"));
        super.add(new Noun("mule", "mules", "a"));
        super.add(new Noun("airship", "airships", "an"));
        super.add(new Noun("horse", "horses", "a"));
        super.add(new Noun("boat", "boats", "a"));
        super.add(new Noun("wagon", "wagons", "a"));
        super.add(new Noun("canoe", "canoes", "a"));
        super.add(new Noun("raft", "rafts", "a"));
        super.add(new Noun("elephant", "elephants", "an"));
        super.add(new Noun("llama", "llamas", "a"));
    }
}