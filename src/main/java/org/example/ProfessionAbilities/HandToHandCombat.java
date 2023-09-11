package org.example.ProfessionAbilities;

public class HandToHandCombat extends Ability{

    private Ability ability;

    public HandToHandCombat(Ability ability){
        this.ability = ability;
    }

    public String PrintAbility(){
        if (!ability.PrintAbility().contains("|Ability to fight in close range|")){
            return ability.PrintAbility() + "|Ability to fight in close range|";
        }else{
            return ability.PrintAbility();
        }
    }
}
