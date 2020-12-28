package net.classic.mlhj.mlhjbackend.lm.chapters;

import net.classic.mlhj.mlhjbackend.lm.LoreCore;
import net.classic.mlhj.mlhjbackend.lm.Noun;
import net.classic.mlhj.mlhjbackend.lm.Thesaurus;
import net.classic.mlhj.mlhjbackend.lm.json.Chapter;

public class Denouement implements ChapterWriter {

    @Override
    public Chapter write(LoreCore core) {
        return Chapter.builder()
            .title(this.getClass().getSimpleName())
            .content(theEnd(core))
            .build();
    }

    public String theEnd(LoreCore core){
        String needy = Thesaurus.getAdjectiveFor("needy");
        String propserous =  Thesaurus.getAdjectiveFor("prosperous");
        Noun party = Thesaurus.getNounFor("party");
        String huge = Thesaurus.getAdjectiveFor("huge");
        String happy = Thesaurus.getAdjectiveFor("happy");

        return "The people of the " + core.getInheritanceRealm() + " are no longer " +
            needy + ": their rightful ruler is now on the throne. There is a " +
            huge + " " + party.getSingular() + ". For many years after, the realm is " +
            propserous + " and " + happy + ".";
    }}
