package org.example.Profession;

import org.example.ProfessionAbilities.*;
import org.example.Hero.Character;

public class Armorer {

    public void addAbility(Character character){
        character.addProfession("Armorer");

        InventoryReparing reparing = new InvertoryReparing(character.getAbility());
        character.setAbility(reparing);
    }
}
