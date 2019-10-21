package com.example.demo.model1;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Component
public class Matches {

    @Id
    @GeneratedValue
    private Long matchID;
    private String team1;
    private String team2;
    private String matchType;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd-MM-yyyy@HH:mm:ss")
    private Date date;
    private String Time;


    public Long getMatchID() {
        return matchID;
    }

    public void setMatchID(Long matchID) {
        this.matchID = matchID;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public Matches(Long matchID, String team1, String team2, String matchType, Date date, String time) {
        this.matchID = matchID;
        this.team1 = team1;
        this.team2 = team2;
        this.matchType = matchType;
        this.date = date;
        Time = time;
    }

    public Matches(){

    }

}
