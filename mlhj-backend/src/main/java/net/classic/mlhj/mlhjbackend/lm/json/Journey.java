package net.classic.mlhj.mlhjbackend.lm.json;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Journey {
    private List<Chapter> chapters;
}
