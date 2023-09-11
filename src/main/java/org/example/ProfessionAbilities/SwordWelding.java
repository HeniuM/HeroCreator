package org.example.ProfessionAbilities;

public class SwordWelding extends Ability{

    private Ability ability;

    public SwordWelding(Ability ability){
        this.ability = ability;
    }

    public String PrintAbility(){
        if (!ability.PrintAbility().contains("|Ability to fight with swords|")){
            return ability.PrintAbility() + "|Ability to fight with swords|";
        }else{
            return ability.PrintAbility();
        }
    }
}
