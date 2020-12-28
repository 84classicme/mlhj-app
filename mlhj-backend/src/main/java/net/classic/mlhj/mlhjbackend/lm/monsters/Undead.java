package net.classic.mlhj.mlhjbackend.lm.monsters;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Undead extends ArrayList<Noun> {

    public Undead() {
        super.add(new Noun("ghoul", "ghouls", "a"));
        super.add(new Noun("ghast", "ghasts", "a"));
        super.add(new Noun("banshee", "banshee", "a"));
        super.add(new Noun("vampire", "vampire", "a"));
        super.add(new Noun("skeleton", "skeletons", "a"));
        super.add(new Noun("wraith", "wraiths", "a"));
        super.add(new Noun("phantom", "phantoms", "a"));
        super.add(new Noun("shadow", "shadows", "a"));
        super.add(new Noun("specter", "specters", "a"));
        super.add(new Noun("phantasm", "phantasms", "a"));
        super.add(new Noun("zombie", "zombies", "a"));
    }
}
