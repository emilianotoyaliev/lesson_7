package org.example;

public class Medic extends Hero{
    int healPoints = 45;

    public void increaseExperience(){
        healPoints += healPoints * 0.1;
        System.out.println(healPoints);
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Medic использовал супер способность HELP");
    }
}
