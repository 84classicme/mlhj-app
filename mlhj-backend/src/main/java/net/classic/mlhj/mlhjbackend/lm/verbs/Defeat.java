package net.classic.mlhj.mlhjbackend.lm.verbs;

import net.classic.mlhj.mlhjbackend.lm.Verb;

import java.util.ArrayList;

public class Defeat extends ArrayList<Verb> {

    public Defeat() {
        super.add(new Verb("conquer", "conquered", "conquered"));
        super.add(new Verb("vanquish", "vanquished", "vanquished"));
        super.add(new Verb("overwhelm", "overwhelmed", "overwhelmed"));
        super.add(new Verb("exterminate", "exterminated", "exterminated"));
        super.add(new Verb("destroy", "destroyed", "destroyed"));
        super.add(new Verb("dispatch", "dispatched", "dispatched"));
        super.add(new Verb("throttle", "throttled", "throttled"));
        super.add(new Verb("decimate", "decimated", "decimated"));
        super.add(new Verb("eviscerate", "eviscerated", "eviscerated"));
        super.add(new Verb("obliterate", "obliterated", "obliterated"));
    }
}