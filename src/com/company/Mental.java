package com.company;

public class Mental extends Heroes implements Superpowerable {
    private String name;
    private int hit;
    private int health;


    @Override
    public String usesuperPower() {
        System.out.println("Telekinez");

        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
