package net.classic.mlhj.mlhjbackend.lm.adjectives;

public enum Nice {
    kind("a"),
    caring("a"),
    thoughtful("a"),
    concerned("a"),
    conscientious("a"),
    considerate("a"),
    gracious("a"),
    friendly("a"),
    goodly("a"),
    generous("a"),
    genial("a"),
    cordial("a");

    public String article;

    Nice(String article){
        this.article=article;
    }
}
