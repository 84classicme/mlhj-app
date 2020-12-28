package net.classic.mlhj.mlhjbackend.lm.nouns;

import net.classic.mlhj.mlhjbackend.lm.Noun;

import java.util.ArrayList;

public class UnitOfTime extends ArrayList<Noun> {

    public UnitOfTime(){
        super.add(new Noun("hour", "hours", "an"));
        super.add(new Noun("day", "days", "a"));
        super.add(new Noun("month", "months", "a"));
        super.add(new Noun("season", "seasons", "a"));
        super.add(new Noun("year", "years", "a"));
    }
}