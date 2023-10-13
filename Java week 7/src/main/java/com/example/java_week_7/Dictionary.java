package com.example.java_week_7;

import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    private final HashMap<String, String> translations;

    public Dictionary() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        translations.put(word, translation);
    }

    public String translate(String word) {
        return translations.get(word);
    }

    public int amountOfWords() {
        return translations.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<>();
        for (String word : translations.keySet()) {
            String translation = word + " = " + translations.get(word);
            translationList.add(translation);
        }
        return translationList;
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        ArrayList<String> translations = dictionary.translationList();
        for (String translation : translations) {
            System.out.println(translation);
        }
    }
}





