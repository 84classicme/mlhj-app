package net.classic.mlhj.mlhjbackend.lm.chapters;

import net.classic.mlhj.mlhjbackend.lm.LoreCore;
import net.classic.mlhj.mlhjbackend.lm.LoreLocationBuilder;
import net.classic.mlhj.mlhjbackend.lm.LoreMonsterBuilder;
import net.classic.mlhj.mlhjbackend.lm.Thesaurus;
import net.classic.mlhj.mlhjbackend.lm.json.Chapter;

public class Flight implements ChapterWriter {

    public String getFlightFromFate(){
        String location = LoreLocationBuilder.getMagicalConstructedLocation();
        String bandits = LoreMonsterBuilder.getBandit(true);
        String greedy = Thesaurus.getAdjectiveFor("greedy");
        return "Frightened by these words, you flee to the nearby "
            .concat(location)
            .concat(" for safety, but on the way you are attacked by ")
            .concat(greedy)
            .concat(" ")
            .concat(bandits)
            .concat(" and left for dead!");
    }

    @Override
    public Chapter write(LoreCore core) {
        return Chapter.builder()
            .title(this.getClass().getSimpleName())
            .content(getFlightFromFate())
            .build();
    }
}
