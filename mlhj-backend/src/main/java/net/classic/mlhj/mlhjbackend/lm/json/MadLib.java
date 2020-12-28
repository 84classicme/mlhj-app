package net.classic.mlhj.mlhjbackend.lm.json;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class MadLib {
    private Integer numTrials;
    private Integer age;
    private String birthPlace;
    private String startHome;
    private String mentor;
    private String guardian;
    private String nice;
    private String endHome;
    private String endLocation;
    private String trialLocation;
    private String foe;
    private String title;
}
