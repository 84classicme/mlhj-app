package net.classic.mlhj.mlhjbackend.lm.locations;

public enum Topography {
    canyon ("in a far-off "),
    forest ("in an immense "),
    glacier ("on an arctic "),
    island ("on a remote "),
    desert ("in the vast "),
    peninsula ("on an uncharted "),
    isthmus ("on a slender "),
    steppes ("on the wind-swept "),
    tundra ("on the frozen "),
    fields ("on the verdant "),
    hills ("in the rolling "),
    mountain ("high atop a "),
    valley ("deep in a "),
    glen ("nestled in a "),
    cove ("protected by a "),
    plains ("on the open ");

    public String preposition;

    Topography(String preposition){
        this.preposition = preposition;
    }
}
