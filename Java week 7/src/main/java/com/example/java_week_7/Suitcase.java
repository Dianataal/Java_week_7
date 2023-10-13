package com.example.java_week_7;

import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing : things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }

    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }

        Thing heaviest = things.get(0);
        for (Thing thing : things) {
            if (thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }

        return heaviest;
    }

    @Override
    public String toString() {
        int totalWeight = totalWeight();
        if (things.isEmpty()) {
            return "empty (" + totalWeight + " kg)";
        } else if (things.size() == 1) {
            return "1 thing (" + totalWeight + " kg)";
        } else {
            return things.size() + " things (" + totalWeight + " kg)";
        }
    }


    public static void main(String[] args) {
        Thing book = new Thing("Happiness in three steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addThing(book);
        System.out.println(suitcase);

        suitcase.addThing(mobile);
        System.out.println(suitcase);

        suitcase.addThing(brick);
        System.out.println(suitcase);
    }
}

