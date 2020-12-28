package net.classic.mlhj.mlhjbackend.lm.adjectives;

public enum Huge {
    gargantuan("a"),
    colossal("a"),
    monumental("a"),
    titanic("a"),
    gigantic("a"),
    tremendous("a"),
    enormous("an"),
    immense("an"),
    stupendous("a"),
    huge("a");

    public String article;

    Huge(String article){
        this.article=article;
    }
}
