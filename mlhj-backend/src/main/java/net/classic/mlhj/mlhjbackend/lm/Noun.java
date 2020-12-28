package net.classic.mlhj.mlhjbackend.lm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Noun {
    private String singular;
    private String plural;
    private String article;
}
