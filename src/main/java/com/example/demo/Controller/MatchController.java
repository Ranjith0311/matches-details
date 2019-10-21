package com.example.demo.Controller;

import com.example.demo.model1.Matches;
import com.example.demo.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@CrossOrigin(allowCredentials = "true",methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
@RestController
public class MatchController {

    @Autowired
    private MatchRepository matchRepository;

    @GetMapping("/home/matches")
    public List<Matches> getMatchesInfo(){
        return matchRepository.findAll();
    }

    @PostMapping("/home/matches")
    public Matches postMatches(@Valid @RequestBody Matches matches){
        return matchRepository.save(matches);

    }


}
