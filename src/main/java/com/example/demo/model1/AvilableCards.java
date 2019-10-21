package com.example.demo.model1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;
import java.util.Date;

@Entity
public class AvilableCards {

    @Id
    private Long matchID;
    @Column(columnDefinition="tinyint(1) default 0")
    private Boolean BlueCardAvilable;
    @Column(columnDefinition="tinyint(1) default 0")
    private Boolean OrangeCardAvilable;
    @Column(columnDefinition="tinyint(1) default 0")
    private Boolean PurpuleCardAvilable;
    @Column(columnDefinition="tinyint(1) default 0")
    private Boolean GreyCardAvilable;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="matchID",referencedColumnName = "matchID")
    private Matches matches;

    public AvilableCards(){}

    public Long getMatchID() {
        return matchID;
    }

    public void setMatchID(Long matchID) {
        this.matchID = matchID;
    }

    public Boolean getBlueCardAvilable() {
        return BlueCardAvilable;
    }

    public void setBlueCardAvilable(Boolean blueCardAvilable) {
        BlueCardAvilable = blueCardAvilable;
    }

    public Boolean getOrangeCardAvilable() {
        return OrangeCardAvilable;
    }

    public void setOrangeCardAvilable(Boolean orangeCardAvilable) {
        OrangeCardAvilable = orangeCardAvilable;
    }

    public Boolean getPurpuleCardAvilable() {
        return PurpuleCardAvilable;
    }

    public void setPurpuleCardAvilable(Boolean purpuleCardAvilable) {
        PurpuleCardAvilable = purpuleCardAvilable;
    }

    public Boolean getGreyCardAvilable() {
        return GreyCardAvilable;
    }

    public void setGreyCardAvilable(Boolean greyCardAvilable) {
        GreyCardAvilable = greyCardAvilable;
    }

    public Matches getMatches() {
        return matches;
    }

    public void setMatches(Matches matches) {
        this.matches = matches;
    }
}
