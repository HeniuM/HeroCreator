package org.example.Profession;

import org.example.Hero.Character;
import org.example.ProfessionAbilities.*;

public class Rouge {
    public void addAbility(Character character){
        character.addProfession("Rouge");

        Stealth stealth = new Stealth(character.getAbility());
        character.setAbility(stealth);

        Poison poison = new Poison(character.getAbility());
        character.setAbility(poison);

        HandToHandCombat handToHandCombat = new HandToHandCombat(character.getAbility());
        character.setAbility(handToHandCombat);
    }
}
