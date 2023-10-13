package com.example.java_week_7;

import java.util.ArrayList;

public class Container {
    private final int maximumWeight;
    private final ArrayList<Suitcase> suitcases;

    public Container(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maximumWeight) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void printThings() {
        System.out.println(suitcases.size() + " suitcase" + (suitcases.size() != 1 ? "s" : "") + " (" + totalWeight() + " kg)");
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcase" + (suitcases.size() != 1 ? "s" : "") + " (" + totalWeight() + " kg)";
    }
}


