package net.classic.mlhj.mlhjbackend.lm;

import net.classic.mlhj.mlhjbackend.lm.locations.Topography;
import net.classic.mlhj.mlhjbackend.lm.names.NameFirstSyllable;
import net.classic.mlhj.mlhjbackend.lm.names.NameSecondSyllable;
import net.classic.mlhj.mlhjbackend.lm.names.Title;

import java.util.List;

public class LoreNpcBuilder {
    public static String getMelniboneanBaddy(){
        String knight = Thesaurus.getSynonymForNpc("royal").getSingular();
        List<Noun> domains = Thesaurus.evilDomains.get(Thesaurus.randomizeIndex(Thesaurus.evilDomains.size()));
        String domain = domains.get(Thesaurus.randomizeIndex(domains.size())).getSingular();
        return Character.toUpperCase(knight.charAt(0)) + knight.substring(1) + " of " + Character.toUpperCase(domain.charAt(0)) + domain.substring(1);
    }

    public static String getBBEG(){
        String name1 = Thesaurus.randomEnum(NameFirstSyllable.class).name();
        String name2 = Thesaurus.randomEnum(NameSecondSyllable.class).name();
        String name = name1 + name2;
        String title = Thesaurus.randomEnum(Title.class).name();
        return name + " the " + title;
    }

    public static String getMentorTitle(String name, String trait){
        return Character.toUpperCase(name.charAt(0)) + name.substring(1) + " the " + Character.toUpperCase(trait.charAt(0)) + trait.substring(1);
    }

    public static String getMentorName(){
        String name1 = Thesaurus.randomEnum(NameFirstSyllable.class).name();
        String name2 = Thesaurus.randomEnum(NameSecondSyllable.class).name();
        return Character.toUpperCase(name1.charAt(0)) + name1.substring(1) + " " +
                Character.toUpperCase(name2.charAt(0)) + name2.substring(1);
    }

    public static String getFortuneTeller(boolean plural){
        return getNpcOfType("fortuneteller", plural);
    }

    public static String getHermit(boolean plural){
        return getNpcOfType("hermit", plural);
    }

    public static String getMentor(boolean plural){
        return getNpcOfType("hostage", plural);
    }

    public static String getNemesis(boolean plural){
        return getNpcOfType("nemesis", plural);
    }

    public static String getRelative(boolean plural){
        return getNpcOfType("relative", plural);
    }

    public static String getRoyal(boolean plural){
        return getNpcOfType("royal", plural);
    }

    public static String getVillager(boolean plural){
        return getNpcOfType("villager", plural);
    }

    private static String getNpcOfType(String type, boolean plural){
        Noun npc = Thesaurus.getSynonymForNpc(type);
        if (plural) return npc.getPlural();
        return npc.getArticle() + " " + npc.getSingular();
    }


    public static String getRulerOfNaturalLocation(){
        String location = Thesaurus.randomEnum(Topography.class).name();
        String ruler = Thesaurus.getSynonymForNpc("royal").getSingular();
        return Character.toUpperCase(ruler.charAt(0)) + ruler.substring(1) + " of the " + Character.toUpperCase(location.charAt(0)) + location.substring(1);
    }
}
