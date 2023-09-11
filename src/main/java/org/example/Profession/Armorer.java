package org.example.Profession;

import org.example.ProfessionAbilities.*;
import org.example.Hero.Character;

public class Armorer {

    public void addAbility(Character character){
        character.addProfession("Armorer");

        InventoryRepairing repairing = new InventoryRepairing(character.getAbility());
        character.setAbility(repairing);
    }
}
