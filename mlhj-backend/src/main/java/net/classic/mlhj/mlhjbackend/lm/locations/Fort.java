package net.classic.mlhj.mlhjbackend.lm.locations;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Fort  extends ArrayList<Noun> {

    public Fort() {
        super.add(new Noun("fortress", "fortresses", "a"));
        super.add(new Noun("fort", "forts", "a"));
        super.add(new Noun("bastion", "bastions", "a"));
        super.add(new Noun("keep", "keeps", "a"));
        super.add(new Noun("stronghold", "strongholds", "a"));
        super.add(new Noun("castle", "castles", "a"));
        super.add(new Noun("citadel", "citadels", "a"));
    }
}
