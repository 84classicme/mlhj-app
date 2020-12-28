package net.classic.mlhj.mlhjbackend.lm.chapters;

import net.classic.mlhj.mlhjbackend.lm.LoreCore;
import net.classic.mlhj.mlhjbackend.lm.Thesaurus;
import net.classic.mlhj.mlhjbackend.lm.json.Chapter;

public class Origin implements ChapterWriter{

    public String getRandomOrigin(LoreCore core) {
        String humble = Thesaurus.getAdjectiveFor("humble");
        String happy = Thesaurus.getAdjectiveFor("happy");
        String timespan = Thesaurus.getNounFor("time").getPlural();

        return  "Your early days were "
            .concat(humble)
            .concat(" but ")
            .concat(happy)
            .concat(". You lived with your ")
            .concat(core.getGuardian())
            .concat(" in a ")
            .concat(core.getOriginHome())
            .concat(" ")
            .concat(core.getOriginLocation())
            .concat(". You spend the ")
            .concat(timespan)
            .concat(" playing with the other children and learning about life in your community.");
    }

    @Override
    public Chapter write(LoreCore core) {
        return Chapter.builder()
            .title(this.getClass().getSimpleName())
            .content(getRandomOrigin(core))
            .build();
    }
}
