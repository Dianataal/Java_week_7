package com.example.java_week_7;

public class Brick {
    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);


        System.out.println("Your suitcase contains the following things:");
        container.printThings();
        System.out.println("Total weight: " + container.totalWeight() + " kg");
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 1; i <= 100; i++) {
            Thing brick = new Thing("Brick", i);
            Suitcase suitcase = new Suitcase(1000);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }
}






