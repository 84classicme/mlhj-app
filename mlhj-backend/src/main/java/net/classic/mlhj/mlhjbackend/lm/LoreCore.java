package net.classic.mlhj.mlhjbackend.lm;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import net.classic.mlhj.mlhjbackend.lm.adjectives.Nice;
import net.classic.mlhj.mlhjbackend.lm.locations.Topography;

@Builder
@Getter
@Setter
/**
//Mad Lib Ideas//
any number 1-25 = adultAge
place you want to visit the most = inheritanceRealm
favorite older relation = guardian
birth city = originLocation
any type of home = originHome
your dream home = inheritancePalace
first name of a favorite teacher = mentor
any adjective that means nice = mentor trait
any number 1-8 = num trials
place from a bad dream you had = nemesislocation
person from a bad dream you had = nemesis
 */

public class LoreCore {
    String inheritanceTitle;
    String guardian;
    Noun fortuneTeller;
    Noun stranger;
    String originHome;
    String originLocation;
    String mentor;
    String mentorTrait;
    String inheritanceRealm;
    String inheritancePalace;
    String inheritanceItem;
    String nemesis;
    String nemesisLocation;
    int adultAge;
    int numLabors;
}
