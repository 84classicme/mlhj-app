package net.classic.mlhj.mlhjbackend.lm.chapters;

import net.classic.mlhj.mlhjbackend.lm.LoreCore;
import net.classic.mlhj.mlhjbackend.lm.Thesaurus;
import net.classic.mlhj.mlhjbackend.lm.json.Chapter;

public class Swallowed implements ChapterWriter {

    @Override
    public Chapter write(LoreCore core) {
        return Chapter.builder()
            .title(this.getClass().getSimpleName())
            .content(swallowedWhole(core))
            .build();
    }

    public String swallowedWhole(LoreCore core){
        String beast = Thesaurus.getSynonymForMonster("animal").getSingular();
        String huge = Thesaurus.getAdjectiveFor("huge");

        return "On the way to " + core.getInheritanceRealm() + " you are attacked--and swallowed whole--by " +
            huge + " " + beast + "!";
    }
}
