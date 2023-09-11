package org.example.Race;

import org.example.Hero.Character;

public class DarkElf extends Character {

    private final String race = "Dark ELf";
    private String raceAbility = "Damage vulnerability, Bonuses for intelligence";

    public DarkElf(String name){
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
