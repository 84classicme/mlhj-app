package net.classic.mlhj.mlhjbackend.lm.chapters;

import net.classic.mlhj.mlhjbackend.lm.LoreCore;
import net.classic.mlhj.mlhjbackend.lm.Noun;
import net.classic.mlhj.mlhjbackend.lm.Thesaurus;
import net.classic.mlhj.mlhjbackend.lm.json.Chapter;

public class Prophesy implements ChapterWriter{

    public String getProphesy(LoreCore core){
        Noun villagers = Thesaurus.getSynonymForNpc("villager");
        String ugly = Thesaurus.getAdjectiveFor("ugly");
        StringBuilder builder = new StringBuilder();
        return builder
            .append("Time passes. Soon you will reach the age of " + core.getAdultAge() + ". It is time to become an adult. ")
            .append("The other ")
            .append(villagers.getPlural())
            .append(" gather outside your ")
            .append(core.getOriginHome())
            .append(" as is your people's custom. ")
            .append("Suddenly, three ")
            .append(ugly)
            .append(" ")
            .append(core.getFortuneTeller().getPlural())
            .append(" make their way to the front of the crowd. All eyes are upon them as they speak as one to foretell of your future: ")
            .append("You will face horrible creatures and lose your family. But one day you will become the ruler of an heard of realm, the ")
            .append(core.getInheritanceRealm())
            .append(".")
            .toString();
    }

    @Override
    public Chapter write(LoreCore core) {
        return Chapter.builder()
            .title(this.getClass().getSimpleName())
            .content(getProphesy(core))
            .build();
    }
}
