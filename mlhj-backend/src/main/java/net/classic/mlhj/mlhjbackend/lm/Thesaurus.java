package net.classic.mlhj.mlhjbackend.lm;

import net.classic.mlhj.mlhjbackend.lm.adjectives.*;
import net.classic.mlhj.mlhjbackend.lm.monsters.*;
import net.classic.mlhj.mlhjbackend.lm.nouns.*;
import net.classic.mlhj.mlhjbackend.lm.npcs.*;
import net.classic.mlhj.mlhjbackend.lm.verbs.*;
import net.classic.mlhj.mlhjbackend.lm.locations.Fort;
import net.classic.mlhj.mlhjbackend.lm.locations.Origin;
import net.classic.mlhj.mlhjbackend.lm.locations.Trial;

import java.util.*;

public class Thesaurus {

    private static Map<String, List<Noun>> nouns = new HashMap<>();
    private static Map<String, List<Verb>> verbs = new HashMap<>();
    private static Map<String, List<Noun>> npcs = new HashMap<>();
    private static Map<String, List<Noun>> locations = new HashMap<>();
    private static Map<String, List<Noun>> monsters = new HashMap<>();
    private static Map<String, Class> adjectives = new HashMap<>();
    public static final List<List<Noun>> evilDomains = new ArrayList<>();

    static{
        initNouns();
        initVerbs();
        initNpcs();
        initLocation();
        initMonsters();
        initEvilDomains();
        initAdjectives();
    }

    public static Noun getNounFor(String entry){
        List<Noun> list =  nouns.get(entry);
        int index = randomizeIndex(list.size());
        return list.get(index);
    }

    public static List<String> getNounEntries(){
        return new ArrayList<>(nouns.keySet());
    }


    public static Noun getSynonymForNpc(String entry){
        List<Noun> list =  npcs.get(entry);
        int index = randomizeIndex(list.size());
        return list.get(index);
    }

    public static List<String> getNpcEntries(){
        return new ArrayList<>(npcs.keySet());
    }

    public static Noun getSynonymForLocation(String entry){
        List<Noun> list =  locations.get(entry);
        int index = randomizeIndex(list.size());
        return list.get(index);
    }

    public static List<String> getLocationEntries(){
        return new ArrayList<>(locations.keySet());
    }

    public static Noun getSynonymForMonster(String entry){
        List<Noun> list =  monsters.get(entry);
        int index = randomizeIndex(list.size());
        return list.get(index);
    }

    public static List<String> getMonsterEntries(){
        return new ArrayList<>(monsters.keySet());
    }


    public static Verb getVerbFor(String entry){
        List<Verb> list =  verbs.get(entry);
        int index = randomizeIndex(list.size());
        return list.get(index);
    }

    public static List<String> getVerbEntries(){
        return new ArrayList<>(verbs.keySet());
    }

    public static String getAdjectiveFor(String entry){
        Class clazz = adjectives.get(entry);
        return randomEnum(clazz).name();
    }

    public static <T extends Enum<?>> T randomEnum(Class<T> clazz){
        Random random = new Random();
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }

    public static int randomizeIndex(int arrayLength){
        Random random = new Random();
        return random.ints(0, arrayLength)
            .findFirst()
            .getAsInt();
    }

    private static void initNouns(){
        nouns.put("element", new Element());
        nouns.put("ennui", new Ennui());
        nouns.put("party", new Party());
        nouns.put("treasure", new Treasure());
        nouns.put("material", new Material());
        nouns.put("ooze", new Ooze());
        nouns.put("sadness", new Sadness());
        nouns.put("time", new UnitOfTime());
        nouns.put("transportation", new Transportation());
    }

    private static void initVerbs(){
        verbs.put("defeat", new Defeat());
        verbs.put("defend", new Defend());
        verbs.put("ambush", new Ambush());
        verbs.put("attack", new Attack());
        verbs.put("trial", new Test());
    }

    private static void initNpcs(){
        npcs.put("fortuneteller", new FortuneTeller());
        npcs.put("hermit", new Hermit());
        npcs.put("hostage", new Hostage());
        npcs.put("mentor", new Mentor());
        npcs.put("villager", new Villager());
        npcs.put("relative", new Relative());
        npcs.put("nemesis", new Nemesis());
        npcs.put("royal", new Royal());
    }

    private static void initLocation(){
        locations.put("fort", new Fort());
        locations.put("origin", new Origin());
        locations.put("trial", new Trial());
    }

    private static void initMonsters(){
        monsters.put("undead", new Undead());
        monsters.put("bandit", new Bandit());
        monsters.put("animal", new Animal());
        monsters.put("barbarian", new Barbarian());
        monsters.put("demon", new Demon());
        monsters.put("european", new European());
    }

    private static void initAdjectives(){
        adjectives.put("beastly", Beastly.class);
        adjectives.put("beautiful", Beautiful.class);
        adjectives.put("deadly", Deadly.class);
        adjectives.put("defeated", Defeated.class);
        adjectives.put("evil", Evil.class);
        adjectives.put("grateful", Grateful.class);
        adjectives.put("greedy", Greedy.class);
        adjectives.put("happy", Happy.class);
        adjectives.put("huge", Huge.class);
        adjectives.put("humble", Humble.class);
        adjectives.put("needy", Needy.class);
        adjectives.put("nice", Nice.class);
        adjectives.put("prosperous", Prosperous.class);
        adjectives.put("sad", Sad.class);
        adjectives.put("struck", Struck.class);
        adjectives.put("ugly", Ugly.class);
        adjectives.put("undeadly", Undeadly.class);

    }

    private static void initEvilDomains(){
        evilDomains.add(new Sadness());
        evilDomains.add(new Ennui());
        evilDomains.add(new Ooze());
    }

}

