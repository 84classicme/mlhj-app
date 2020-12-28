package net.classic.mlhj.mlhjbackend.lm.chapters;

import net.classic.mlhj.mlhjbackend.lm.*;
import net.classic.mlhj.mlhjbackend.lm.json.Chapter;
import net.classic.mlhj.mlhjbackend.lm.verbs.Test;
import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.List;


public class Trials implements ChapterWriter {

    private static final List<String> trialFoes = new ArrayList<>();

    static{
        trialFoes.add("Default");
        trialFoes.add("Demon");
    }

    @Override
    public Chapter write(LoreCore core) {
        return Chapter.builder()
            .title(this.getClass().getSimpleName())
            .content("Along they way your heroism is tested in " + core.getNumLabors() + " epic trials...")
            .trials(writeTrials(core))
            .build();
    }


//    public String writeTrials(LoreCore core) {
    public List<Chapter> writeTrials(LoreCore core) {
        //StringBuilder labors = new StringBuilder();
        List<Chapter> sidequests = new ArrayList<>();
        //if(core.getNumLabors() > 0)
        //labors.append("Along they way your heroism is tested in ").append(core.getNumLabors()).append(" epic trials...");
        Test tests = new Test();
        Object[] trials = tests.toArray();
        for(int i = 1; i <= core.getNumLabors(); i++){
            int index = Thesaurus.randomizeIndex(trials.length);
            Verb trial = (Verb)trials[index];
            //labors.append(i).append(". ").append(writeTrial(trial, core));
            sidequests.add(Chapter.builder().number(i).content(writeTrial(trial, core)).build());
            trials = ArrayUtils.remove(trials,index);
        }
        //return labors.toString();
        return sidequests;
    }

    public static String getRandomTrialFoe(){
        switch(trialFoes.get(Thesaurus.randomizeIndex(trialFoes.size()))){
            case("Default"):
                return LoreMonsterBuilder.getMonster(false);
            case("Demon"):
                return LoreMonsterBuilder.getDemon(false);
            default:
                return "";
        }
    }

    public String writeTrial(Verb trialChosen, LoreCore core){
        // Main nouns
        String trial = trialChosen.getPresent();
        String foe = getRandomTrialFoe();
        String acranefoe = LoreNpcBuilder.getMelniboneanBaddy();
        String treasure = LoreItemBuilder.getMagicalTreasure();
        String mentorName = LoreNpcBuilder.getMentorTitle(core.getMentor(), core.getMentorTrait());
        String ruler = LoreNpcBuilder.getRulerOfNaturalLocation();
        String trialLocation = LoreLocationBuilder.getTrialLocation();

        // Filler Synonyms
        Noun hostage = Thesaurus.getSynonymForNpc("hostage");
        Noun event = Thesaurus.getNounFor("party");
        String beastly = Thesaurus.getAdjectiveFor("beastly");
        Noun beast = Thesaurus.getSynonymForMonster("animal");
        Noun peasant = Thesaurus.getSynonymForNpc("villager");
        String grateful = Thesaurus.getAdjectiveFor("grateful");
        String needy = Thesaurus.getAdjectiveFor("needy");
        Verb defeat = Thesaurus.getVerbFor("defeat");
        String struck = Thesaurus.getAdjectiveFor("struck");
        String evil = Thesaurus.getAdjectiveFor("evil");
        String nice = Thesaurus.getAdjectiveFor("nice");
        String huge = Thesaurus.getAdjectiveFor("huge");
        String deadly = Thesaurus.getAdjectiveFor("deadly");
        Noun mentor = Thesaurus.getSynonymForNpc("mentor");

        switch(trial){
            case("endure"):
                return "You " + trial + " the perils within the " + trialLocation + " and earn the respect of its owner, the " + deadly + " " + acranefoe + ".";
            case("capture"):
                return "You " + trial + " " + foe + " and ride it into battle, where you " + defeat.getPast() + " your enemies.";
            case("tame"):
                return "You " + trial + " " + foe + " and it becomes your " + nice + " companion throughout your adventures.";
            case("discover"):
                return "You " + trial + " the " + trialLocation + " and the " + beastly + " " + beast.getPlural() + " that live there.";
            case("traverse"):
                return "You train a team of " + beastly + " " + beast.getPlural() + " and successfully " + trial + " the uncharted " + trialLocation + ".";
            case("slay"):
                return "You " + trial + " " + foe + " in a battle to the death, having " + struck + " your foe with a mortal blow.";
            case("defeat"):
                return "Your path is blocked by " + foe + "! You " + defeat.getPresent() + " the " + evil + " monster with help from the fabled " + treasure + ".";
            case("steal"):
                return "By moonlight you " + trial + " the " + treasure + " from the " + acranefoe + " and return it to the " + needy + " " + peasant.getPlural() + " who rightfully owned it.";
            case("recover"):
                return "You " + trial + " the lost " + treasure + " for the " + grateful + " " + peasant.getPlural() + " of the " + trialLocation + ".";
            case("obtain"):
                return "The " + ruler + " asks that you " + trial + " the " + treasure + ". You succeed with help from your " + mentor.getSingular() + ", " + mentorName + ".";
            case("rescue"):
                return "You " + trial + " the " + hostage.getSingular() + " from " + foe + " and the people of the " + trialLocation + " held " + event.getArticle() + " " + event.getSingular() + " in your honor.";
            case("rid"):
                return "Some " + needy + " " + peasant.getPlural() + " beg you to " + trial + " the area of the dreaded " +  foe + " and you " + defeat.getPresent()+ " it in " + huge + " battle.";
            case("cleanse"):
                return "You " + trial + " the " + trialLocation + " of its " + evil + " denizens to claim the " + treasure + ".";
            default:
                return "";
        }
    }
}
