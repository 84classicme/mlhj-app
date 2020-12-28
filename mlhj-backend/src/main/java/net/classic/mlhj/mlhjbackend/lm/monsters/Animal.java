package net.classic.mlhj.mlhjbackend.lm.monsters;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Animal extends ArrayList<Noun> {

    public Animal() {
        super.add(new Noun("alligator", "alligators", "an"));
        super.add(new Noun("snake", "snakes", "a"));
        super.add(new Noun("toad", "toads", "a"));
        super.add(new Noun("spider", "spiders", "a"));
        super.add(new Noun("lizard", "lizards", "a"));
        super.add(new Noun("jackal", "jackals", "a"));
        super.add(new Noun("arachnid", "arachnids", "a"));
        super.add(new Noun("hyena", "hyena", "an"));
        super.add(new Noun("vulture", "vultures", "a"));
        super.add(new Noun("raven", "ravens", "a"));
        super.add(new Noun("panther", "panthers", "a"));
        super.add(new Noun("crocodile", "crocodiles", "a"));
        super.add(new Noun("boar", "boars", "a"));
        super.add(new Noun("scorpion", "scorpion", "a"));
        super.add(new Noun("baboon", "baboons", "a"));
        super.add(new Noun("wasp", "wasps", "a"));
        super.add(new Noun("wolf", "wolves", "a"));
    }
}