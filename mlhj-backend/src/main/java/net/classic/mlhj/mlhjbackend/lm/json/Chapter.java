package net.classic.mlhj.mlhjbackend.lm.json;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Chapter {
    private int number;
    private String title;
    private String content;
    private List<Chapter> trials;
}
