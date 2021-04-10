package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Vase.printStaticNumberOfObj();
        Vase vase1 = new Vase();
        Vase vase2 = new Vase(7, 5, "Wood", "Blue");
        Vase vase3 = new Vase(13, 17, "Glue", "Yellow", "Big", 300, "Germany", 1003, "20%", 20);
        System.out.println(vase1);
        System.out.println(vase2);
        System.out.println(vase3);
        vase1.printNumberOfObj();
        vase1.resetValues(11, 15, "Glue", "Green", "middle", 450, "Poland", 1001, "30%", 25);
        System.out.println(vase1);
    }
}