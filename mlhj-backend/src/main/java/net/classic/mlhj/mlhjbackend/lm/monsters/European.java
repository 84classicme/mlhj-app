package net.classic.mlhj.mlhjbackend.lm.monsters;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class European extends ArrayList<Noun> {

    public European() {
        super.add(new Noun("giant", "giants", "a"));
        super.add(new Noun("ogre", "ogres", "a"));
        super.add(new Noun("troll", "troll", "a"));
        super.add(new Noun("dragon", "dragons", "a"));
        super.add(new Noun("manticore", "manticores", "a"));
        super.add(new Noun("basilisk", "basilisks", "a"));
        super.add(new Noun("cockatrice", "cockatrices", "a"));
        super.add(new Noun("jabberwocky", "jabberwockies", "a"));
        super.add(new Noun("bugbear", "bugbears", "a"));
        super.add(new Noun("doppleganger", "dopplegangers", "a"));
    }
}
