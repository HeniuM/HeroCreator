package org.example.ProfessionAbilities;

public class InventoryRepairing extends Ability {
    private Ability ability;

    public InventoryRepairing(Ability ability){
        this.ability = ability;
    }

    public String PrintAbility(){
        if (!ability.PrintAbility().contains("|Ability to repair equipment|")){
            return ability.PrintAbility() + "|Ability to repair equipment|";
        }else{
            return ability.PrintAbility();
        }
    }
}
