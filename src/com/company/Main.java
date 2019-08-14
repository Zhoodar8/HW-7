package com.company;

public class Main {

    public static void main(String[] args) {


        Heroes w = new Warrior();
        w.level = 2;

        Heroes w1 = new Magic();
        w.level = 2;

        Heroes w2 = new Mental();
        w.level = 4;

        Heroes[] heroes = {w, w1, w2};

         for (int i= 0; i < heroes.length; i++) {


             System.out.println(
                     ((Superpowerable)heroes[i]).usesuperPower());

         }
    }
}
