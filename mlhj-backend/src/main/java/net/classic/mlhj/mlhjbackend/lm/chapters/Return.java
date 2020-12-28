package net.classic.mlhj.mlhjbackend.lm.chapters;

import net.classic.mlhj.mlhjbackend.lm.LoreCore;
import net.classic.mlhj.mlhjbackend.lm.json.Chapter;

public class Return implements ChapterWriter{

    @Override
    public Chapter write(LoreCore core) {
        return Chapter.builder()
            .title(this.getClass().getSimpleName())
            .content(returnToTheSurface(core))
            .build();
    }

    public String returnToTheSurface(LoreCore core){
        return "Through cunning and might you make your way out of the belly of the beast. " +
                "You are more confident than ever that you can overcome your nemesis and claim your rightful place " +
                "and once more head out toward your inherited realm.";
    }
}
