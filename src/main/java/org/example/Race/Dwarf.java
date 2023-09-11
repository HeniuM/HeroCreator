package org.example.Race;

import org.example.Hero.Character;

public class Dwarf extends Character {

    private final String race = "Dwarf";
    private String raceAbility = "Bonuses for constitution, better mining and \n" +
            "blacksmith skills";

    public Dwarf(String name){
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
