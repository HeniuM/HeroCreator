package org.example.ProfessionAbilities;

public class SpearWelding extends Ability{

    private Ability ability;

    public SpearWelding(Ability ability){
        this.ability = ability;
    }

    public String PrintAbility(){
        if (!ability.PrintAbility().contains("|Ability to fight with spears|")){
            return ability.PrintAbility() + "|Ability to fight with spears|";
        }else{
            return ability.PrintAbility();
        }
    }
}
