package com.example.java_week_7;

public class Heaviest {
        public static void main(String[] args) {
            Thing book = new Thing("Happiness in Three Steps", 2);
            Thing mobile = new Thing("Nokia 3210", 1);
            Thing brick = new Thing("Brick", 4);

            Suitcase suitcase = new Suitcase(10);
            suitcase.addThing(book);
            suitcase.addThing(mobile);
            suitcase.addThing(brick);

            Thing heaviest = suitcase.heaviestThing();
            if (heaviest != null) {
                System.out.println("The heaviest thing: " + heaviest);
            } else {
                System.out.println("The suitcase is empty.");
            }
        }
    }


