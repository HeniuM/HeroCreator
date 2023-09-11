package org.example.Race;

import org.example.Hero.Character;

public class Human extends Character {

    private final String race = "Human";

    private String raceAbility = "Cold resistance, Bonuses for strength";

    public Human(String name){
        super(name);
        this.raceAbility = raceAbility;
    }

    @Override
    public String getRaceAbility(){
        return raceAbility;
    }

    @Override
    public void setRaceAbility(String raceAbility){
        this.raceAbility = raceAbility;
    }

    public String getRace(){
        return race;
    }
}
