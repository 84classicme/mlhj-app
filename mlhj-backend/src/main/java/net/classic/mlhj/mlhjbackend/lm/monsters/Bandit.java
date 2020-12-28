package net.classic.mlhj.mlhjbackend.lm.monsters;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Bandit extends ArrayList<Noun> {

    public Bandit() {
        super.add(new Noun("scoundrel", "scoundrels", "a"));
        super.add(new Noun("villain", "villains", "a"));
        super.add(new Noun("blackguard", "blackguards", "a"));
        super.add(new Noun("scalawag", "scalawags", "a"));
        super.add(new Noun("rapscallion", "rapscallions", "a"));
        super.add(new Noun("rogue", "rogues", "a"));
        super.add(new Noun("bandit", "bandits", "a"));
        super.add(new Noun("thief", "thieves", "an"));
        super.add(new Noun("knave", "knaves", "a"));
        super.add(new Noun("reaver", "reavers", "a"));

    }
}