package net.classic.mlhj.mlhjbackend.lm.npcs;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Villager extends ArrayList<Noun> {

public Villager() {
    super.add(new Noun("peasant", "peasants", "a"));
    super.add(new Noun("villager", "villagers", "a"));
    super.add(new Noun("inhabitant", "inhabitants", "an"));
    super.add(new Noun("citizen", "citizens", "a"));
    super.add(new Noun("commoner", "commoners", "a"));
    }
}