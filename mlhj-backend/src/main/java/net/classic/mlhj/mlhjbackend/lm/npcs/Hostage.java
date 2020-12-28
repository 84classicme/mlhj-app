package net.classic.mlhj.mlhjbackend.lm.npcs;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Hostage  extends ArrayList<Noun> {

    public Hostage() {
        super.add(new Noun("King", "", "the"));
        super.add(new Noun("Queen", "", "the"));
        super.add(new Noun("Prince", "", "the"));
        super.add(new Noun("Princess", "", "the"));
        super.add(new Noun("Dauphin", "", "the"));
        super.add(new Noun("Dauphine", "", "the"));

    }
}
