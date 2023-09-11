package org.example.ProfessionAbilities;

public class Alchemy extends Ability{

    private Ability ability;

    public Alchemy(Ability ability){
        this.ability = ability;
    }
    @Override
    public String PrintAbility(){
        if(!ability.PrintAbility().contains("|Ability to use Alchemy|")){
            return ability.PrintAbility() + "|Ability to use Alchemy|";
        }else{
            return ability.PrintAbility();
        }
    }
}
