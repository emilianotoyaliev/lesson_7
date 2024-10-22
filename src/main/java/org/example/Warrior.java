package org.example;

import static javax.naming.ldap.Control.CRITICAL;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {
        System.out.println("Warrior использовал супер способность CRITICAL DAMAGE");
    }
}
