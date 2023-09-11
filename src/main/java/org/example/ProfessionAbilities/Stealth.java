package org.example.ProfessionAbilities;

public class Stealth extends Ability{

    private Ability ability;

    public Stealth(Ability ability){
        this.ability = ability;
    }

    public String PrintAbility(){
        if (!ability.PrintAbility().contains("|Ability to use Stealth skills|")){
            return ability.PrintAbility() + "|Ability to use Stealth skills|";
        }else{
            return ability.PrintAbility();
        }
    }
}
