package net.classic.mlhj.mlhjbackend.lm;

public class LoreMonsterBuilder {

    public static String getDemon(boolean plural){
        return getMonsterOfType("demon", plural);
    }

    public static String getBandit(boolean plural){
        return getMonsterOfType("bandit", plural);
    }

    public static String getMonster(boolean plural){ return getMonsterOfType("european", plural); }

    public static String getAnimal(boolean plural){
        return getMonsterOfType("animal", plural);
    }

    public static String getBarbarian(boolean plural){
        return getMonsterOfType("barbarian", plural);
    }

    public static String getUndead(boolean plural){
        return getMonsterOfType("undead", plural);
    }

    private static String getMonsterOfType(String type, boolean plural){
        Noun npc = Thesaurus.getSynonymForMonster(type);
        if (plural) return npc.getPlural();
        return npc.getArticle() + " " + npc.getSingular();
    }
}
