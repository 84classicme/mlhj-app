package net.classic.mlhj.mlhjbackend.lm.chapters;

import net.classic.mlhj.mlhjbackend.lm.LoreCore;
import net.classic.mlhj.mlhjbackend.lm.json.Chapter;

public class Recovery implements ChapterWriter{

    public String getBetter(LoreCore core){
        return "You are taken in and learn much about your true inheritance as the ruler of the " +
                core.getInheritanceRealm() + ".";
    }

    @Override
    public Chapter write(LoreCore core) {
        return Chapter.builder()
            .title(this.getClass().getSimpleName())
            .content(getBetter(core))
            .build();
    }
}
