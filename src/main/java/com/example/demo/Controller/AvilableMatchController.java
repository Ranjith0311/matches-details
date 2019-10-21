package com.example.demo.Controller;


import com.example.demo.model1.AvilableCards;
import com.example.demo.model1.Matches;
import com.example.demo.repository.AvilableCardsRepository;
import com.example.demo.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@CrossOrigin(allowCredentials = "true",methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RestController
public class AvilableMatchController {

    @Autowired
    private AvilableCardsRepository avilableCardsRepository;
    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private Matches matches;


    @GetMapping("/matches/chooseCardType/{matchId}")
    public Optional<AvilableCards> getAvilableMatchCardDetails(@PathVariable Long matchId){
        return  avilableCardsRepository.findById(matchId);
    }

    @PostMapping("/matches/chooseCardType")
    public AvilableCards setAvilableCardDetails(@Valid @RequestBody AvilableCards avilableCards){
       Optional<Matches> Optmatches= matchRepository.findById(avilableCards.getMatchID());
       avilableCards.setMatches(Optmatches.get());
       return avilableCardsRepository.save(avilableCards);
    }
}
