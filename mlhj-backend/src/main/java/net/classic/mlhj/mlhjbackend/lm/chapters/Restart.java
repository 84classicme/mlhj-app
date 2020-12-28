package net.classic.mlhj.mlhjbackend.lm.chapters;

import net.classic.mlhj.mlhjbackend.lm.LoreCore;
import net.classic.mlhj.mlhjbackend.lm.Thesaurus;
import net.classic.mlhj.mlhjbackend.lm.json.Chapter;

public class Restart implements ChapterWriter{

    @Override
    public Chapter write(LoreCore core) {
        return Chapter.builder()
            .title(this.getClass().getSimpleName())
            .content(restart(core))
            .build();
    }

    public String restart(LoreCore core){
        String mode = Thesaurus.getNounFor("transportation").getSingular();
        return "Eventually you become restless, eager to find the " + core.getInheritanceRealm() +
            ". Your mentor anticipates all of this of course. With warm words and a last piece of advice you are bid farewell. " + "" +
            "You start your journey the next morning by " + mode  + ".";
    }
}
