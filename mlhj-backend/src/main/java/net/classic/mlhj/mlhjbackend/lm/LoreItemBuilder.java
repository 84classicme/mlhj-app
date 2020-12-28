package net.classic.mlhj.mlhjbackend.lm;

public class LoreItemBuilder {

    public static String getMagicalTreasure(){
        Noun t = Thesaurus.getNounFor("treasure");
        String treasure = t.getSingular();
        String material = Thesaurus.getNounFor("element").getSingular();
        return Character.toUpperCase(treasure.charAt(0)) + treasure.substring(1) + " of " + Character.toUpperCase(material.charAt(0)) + material.substring(1);
    }
}
