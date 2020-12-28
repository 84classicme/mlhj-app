package net.classic.mlhj.mlhjbackend.lm.chapters;

import net.classic.mlhj.mlhjbackend.lm.LoreCore;
import net.classic.mlhj.mlhjbackend.lm.Noun;
import net.classic.mlhj.mlhjbackend.lm.Thesaurus;
import net.classic.mlhj.mlhjbackend.lm.adjectives.Nice;
import net.classic.mlhj.mlhjbackend.lm.json.Chapter;

public class Help implements ChapterWriter{

    public String encounterMentor(LoreCore core){
        Noun hermit = Thesaurus.getSynonymForNpc("hermit");
        String trait = core.getMentorTrait();
        return "You are hungry and miss your family. You also feel ashamed about leaving. "
            .concat("The situation seems dire indeed. Suddenly you hear a twig snap,")
            .concat(" and out from behind a tree appears a ")
            .concat(trait)
            .concat(" ")
            .concat(hermit.getSingular())
            .concat(", who greets you by name. In fact, they seem know everything about you.");
    }

    @Override
    public Chapter write(LoreCore core) {
        return Chapter.builder()
            .title(this.getClass().getSimpleName())
            .content(encounterMentor(core))
            .build();
    }
}
