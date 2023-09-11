package org.example.ProfessionAbilities;

public class Shooting extends Ability{

    private Ability ability;

    public Shooting(Ability ability){
        this.ability = ability;
    }

    public String PrintAbility(){
        if (!ability.PrintAbility().contains("|Ability to use range weapons|")){
            return ability.PrintAbility() + "|Ability to use range weapons|";
        }else{
            return ability.PrintAbility();
        }
    }
}
