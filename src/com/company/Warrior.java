package com.company;

public class Warrior extends Heroes implements Superpowerable {
    String name;
    int hit;
    int health;


    @Override
    public String usesuperPower() {
        System.out.println("SuperHit");

        return null;
    }
}
