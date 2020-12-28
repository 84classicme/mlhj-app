package net.classic.mlhj.mlhjbackend.controllers;

import lombok.extern.slf4j.Slf4j;
import net.classic.mlhj.mlhjbackend.lm.LoreCore;
import net.classic.mlhj.mlhjbackend.lm.LoreMaster;
import net.classic.mlhj.mlhjbackend.lm.json.Journey;
import net.classic.mlhj.mlhjbackend.lm.json.MadLib;
import net.classic.mlhj.mlhjbackend.mappers.MadLibToLoreCoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@Slf4j
@CrossOrigin(origins = "*")
@RestController
public class MlhjController {

    @Autowired
    LoreMaster loreMaster;

    @PostMapping("/mlhj/journey")
    public Mono<Journey> postJourney(@RequestBody MadLib madLib){
        log.info("Getting journey from madlib: {}", madLib.toString());
        LoreCore lc = MadLibToLoreCoreMapper.mapMadLibtoLoreCore(madLib);
        Journey j = loreMaster.getJourneyLore(lc);
        return Mono.just(j);
    }

    @GetMapping("/mlhj/journey")
    public Mono<Journey> getJourney(@RequestParam(required = false) Integer numTrials){
        Integer number = numTrials == null ? 3 : numTrials;
        return Mono.just(loreMaster.getJourneyLore(number));
    }

    @GetMapping("/mlhj/trials")
    public Mono<Journey> getTrials(){
        return Mono.just(loreMaster.getJourneyLore());
    }
}
