package org.example.Profession;

import org.example.Hero.Character;
import org.example.ProfessionAbilities.*;

public class Warrior {

    public void addAbility(Character character){
        character.addProfession("Warrior");

        HandToHandCombat handToHandCombat = new HandToHandCombat(character.getAbility());
        character.setAbility(handToHandCombat);

        SwordWelding swordWelding = new SwordWelding(character.getAbility());
        character.setAbility(swordWelding);

        SpearWelding spearWelding = new SpearWelding(character.getAbility());
        character.setAbility(swordWelding);

        AxeWelding axeWelding = new AxeWelding(character.getAbility());
        character.setAbility(axeWelding);
    }
}
