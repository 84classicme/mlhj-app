package net.classic.mlhj.mlhjbackend.lm;

import net.classic.mlhj.mlhjbackend.lm.locations.Topography;


public class LoreLocationBuilder {

    public static String getMagicalConstructedLocation(){
        String location = Thesaurus.getSynonymForLocation("fort").getSingular();
        String material = Thesaurus.getNounFor("material").getSingular();
        return Character.toUpperCase(location.charAt(0)) + location.substring(1) + " of " + Character.toUpperCase(material.charAt(0)) + material.substring(1);
    }

    public static String getMagicalNaturalLocation(){
        String location = Thesaurus.randomEnum(Topography.class).name();
        String material = Thesaurus.getNounFor("element").getSingular();
        return Character.toUpperCase(location.charAt(0)) + location.substring(1) + " of " + Character.toUpperCase(material.charAt(0)) + material.substring(1);
    }

    public static String getTrialLocation(){
        String location = Thesaurus.getSynonymForLocation("trial").getSingular();
        String material = Thesaurus.getNounFor("element").getSingular();
        return Character.toUpperCase(location.charAt(0)) + location.substring(1) + " of " + Character.toUpperCase(material.charAt(0)) + material.substring(1);
    }
}
