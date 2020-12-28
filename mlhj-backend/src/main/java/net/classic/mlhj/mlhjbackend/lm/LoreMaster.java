package net.classic.mlhj.mlhjbackend.lm;

import net.classic.mlhj.mlhjbackend.lm.adjectives.*;
import net.classic.mlhj.mlhjbackend.lm.chapters.*;
import net.classic.mlhj.mlhjbackend.lm.json.Journey;
import net.classic.mlhj.mlhjbackend.lm.json.Chapter;
import net.classic.mlhj.mlhjbackend.lm.locations.Topography;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoreMaster {

    public Journey getJourneyLore(){
        return getJourneyLore(generateLoreCore());
    }

    public Journey getJourneyLore(int numTrials){
        LoreCore core = generateLoreCore();
        core.setNumLabors(numTrials);
        return getJourneyLore(core);
    }

    public Journey getJourneyLore(LoreCore core){
        List<Chapter> chapters = new ArrayList<>();
        int number = 1;
        for (ChapterWriter writer : LoreMaster.chapters) {
            Chapter chapter = writer.write(core);
            chapter.setNumber(number);
            chapters.add(chapter);
            number++;
        }
        return new Journey(chapters);
    }

    private LoreCore generateLoreCore(){
        Topography originLocation = Thesaurus.randomEnum(Topography.class);
        String origiLocationString = originLocation.preposition + " " + originLocation.name();
        return LoreCore.builder()
            .fortuneTeller(Thesaurus.getSynonymForNpc("fortuneteller"))
            .guardian(Thesaurus.getSynonymForNpc("relative").getSingular())
            .inheritanceItem(LoreItemBuilder.getMagicalTreasure())
            .inheritancePalace(LoreLocationBuilder.getMagicalConstructedLocation())
            .inheritanceRealm(LoreLocationBuilder.getMagicalNaturalLocation())
            .inheritanceTitle(Thesaurus.getSynonymForNpc("royal").getSingular())
            .mentor(LoreNpcBuilder.getMentorName())
            .mentorTrait(Thesaurus.randomEnum(Nice.class).name())
            .nemesis(LoreNpcBuilder.getBBEG())
            .nemesisLocation(LoreLocationBuilder.getTrialLocation())
            .originHome(Thesaurus.getSynonymForLocation("origin").getSingular())
            .originLocation(origiLocationString)
            .stranger(Thesaurus.getSynonymForNpc("hermit"))
            .numLabors(3)
            .build();
    }

    private static final List<ChapterWriter> chapters = new ArrayList<>();

    static{
        chapters.add(new Origin());
        chapters.add(new Prophesy());
        chapters.add(new Flight());
        chapters.add(new Help());
        chapters.add(new Recovery());
        chapters.add(new Restart());
        chapters.add(new Swallowed());
        chapters.add(new Return());
        chapters.add(new Trials());
        chapters.add(new Confrontation());
        chapters.add(new Denouement());
    }
}
