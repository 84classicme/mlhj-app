package net.classic.mlhj.mlhjbackend.lm.npcs;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class Mentor extends ArrayList<Noun> {

    public Mentor() {
        super.add(new Noun("teacher", "teachers", "a"));
        super.add(new Noun("instructor", "instructors", "an"));
        super.add(new Noun("preceptor", "preceptors", "a"));
        super.add(new Noun("mentor", "mentors", "a"));
        super.add(new Noun("guide", "guides", "a"));
        super.add(new Noun("docent", "docent", "a"));
        super.add(new Noun("advisor", "advisors", "an"));
        super.add(new Noun("counsel", "counsels", "a"));
    }
}