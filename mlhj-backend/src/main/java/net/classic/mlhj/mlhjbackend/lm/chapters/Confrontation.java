package net.classic.mlhj.mlhjbackend.lm.chapters;

import net.classic.mlhj.mlhjbackend.lm.LoreCore;
import net.classic.mlhj.mlhjbackend.lm.Thesaurus;
import net.classic.mlhj.mlhjbackend.lm.json.Chapter;

public class Confrontation implements ChapterWriter {

    @Override
    public Chapter write(LoreCore core) {
        return Chapter.builder()
            .title(this.getClass().getSimpleName())
            .content(victory(core))
            .build();
    }

    public String victory(LoreCore core){
        String defeated = Thesaurus.getAdjectiveFor("defeated");
        return "At last, you arrive at the " + core.getInheritancePalace() + ". You confront your nemesis, " +
            core.getNemesis() + ", who is " + defeated + " by your mighty blows!";
    }

}
