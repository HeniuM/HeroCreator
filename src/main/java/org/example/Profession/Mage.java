package org.example.Profession;

import org.example.Hero.Character;
import org.example.ProfessionAbilities.*;
public class Mage {

    public void addAbility(Character character){
        character.addProfession("Hunter");

        Enchantment enchantment = new Enchantment(character.getAbility());
        character.setAbility(enchantment);

        Alchemy alchemy = new Alchemy(character.getAbility());
        character.setAbility(alchemy);
    }
}
