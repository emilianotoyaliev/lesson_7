package org.example;

public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Medic(), new Magic(), new Warrior()};

        for (Hero hero: heroes){
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}