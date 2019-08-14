package com.company;

public class Magic extends Heroes implements Superpowerable {
    String name;
    int hit;
    int health;

    @Override
    public String usesuperPower() {
        System.out.println("Stun");

        return null;
    }
}
