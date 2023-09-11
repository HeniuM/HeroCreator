package org.example.ProfessionAbilities;

public class Enchantment extends Ability{

    private Ability ability;

    public Enchantment(Ability ability){
        this.ability = ability;
    }

    public String PrintAbility(){
        if (!ability.PrintAbility().contains("|Ability to use Enchantments|")){
            return ability.PrintAbility() + "|Ability to use Enchantments|";
        }else{
            return ability.PrintAbility();
        }
    }
}
