package net.classic.mlhj.mlhjbackend.mappers;

import net.classic.mlhj.mlhjbackend.lm.*;
import net.classic.mlhj.mlhjbackend.lm.adjectives.Nice;
import net.classic.mlhj.mlhjbackend.lm.json.MadLib;
import net.classic.mlhj.mlhjbackend.lm.locations.Topography;
import org.springframework.stereotype.Service;

@Service
public class MadLibToLoreCoreMapper {

    public static LoreCore mapMadLibtoLoreCore(MadLib madLib){
        Topography originLocation = Thesaurus.randomEnum(Topography.class);
        String origiLocationString = originLocation.preposition + " " + originLocation.name();
        return LoreCore.builder()
            .adultAge(madLib.getAge() == null ? 12 : madLib.getAge())
            .inheritancePalace(
                madLib.getEndHome() == null || madLib.getEndHome().isEmpty() ?
                    LoreLocationBuilder.getMagicalConstructedLocation() : madLib.getEndHome()
            )
            .inheritanceRealm(
                madLib.getEndLocation() == null || madLib.getEndLocation().isEmpty() ?
                    LoreLocationBuilder.getMagicalNaturalLocation() : madLib.getEndLocation())
            .mentor(
                madLib.getMentor() == null || madLib.getMentor().isEmpty() ?
                    LoreNpcBuilder.getMentorName() : madLib.getMentor())
            .mentorTrait(
                madLib.getNice() == null || madLib.getNice().isEmpty() ?
                    Thesaurus.randomEnum(Nice.class).name() : madLib.getNice())
            .nemesis(
                madLib.getFoe() == null || madLib.getFoe().isEmpty() ?
                    LoreNpcBuilder.getBBEG() : madLib.getFoe())
            .nemesisLocation(
                madLib.getTrialLocation() == null || madLib.getTrialLocation().isEmpty() ?
                    LoreLocationBuilder.getTrialLocation() : madLib.getTrialLocation())
            .numLabors(
                madLib.getNumTrials() == null ? 3 : madLib.getNumTrials())
            .originHome(
                madLib.getStartHome() == null || madLib.getStartHome().isEmpty() ?
                    Thesaurus.getSynonymForLocation("origin").getSingular() : madLib.getStartHome())
            .originLocation(
                madLib.getBirthPlace() == null || madLib.getBirthPlace().isEmpty() ?
                    origiLocationString : madLib.getBirthPlace())
            .guardian(
                madLib.getGuardian() == null || madLib.getGuardian().isEmpty() ?
                    Thesaurus.getSynonymForNpc("relative").getSingular() : madLib.getGuardian())
            .inheritanceTitle(
                madLib.getTitle() == null || madLib.getTitle().isEmpty() ?
                    Thesaurus.getSynonymForNpc("royal").getSingular() :madLib.getTitle())
            .fortuneTeller(Thesaurus.getSynonymForNpc("fortuneteller"))
            .inheritanceItem(LoreItemBuilder.getMagicalTreasure())
            .stranger(Thesaurus.getSynonymForNpc("hermit"))
            .build();
    }
}
