package org.example.ProfessionAbilities;

public class Poison extends Ability{

    private Ability ability;

    public Poison(Ability ability){
        this.ability = ability;
    }

    public String PrintAbility(){
        if (!ability.PrintAbility().contains("|Ability to use Poison abilities|")){
            return ability.PrintAbility() + "|Ability to use Poison abilities|";
        }else{
            return ability.PrintAbility();
        }
    }
}

