package com.example.java_week_7;
import java.util.Scanner;

public class TextUserInterface {
    private final Scanner reader;
    private final Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement:\n  quit - quit the text user interface");

        while (true) {
            System.out.print("Statement: ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (command.equals("add")) {
                System.out.print("In Finnish: ");
                String word = reader.nextLine();
                System.out.print("Translation: ");
                String translation = reader.nextLine();
                dictionary.add(word, translation);
            } else if (command.equals("translate")) {
                System.out.print("Give a word: ");
                String word = reader.nextLine();
                String translation = dictionary.translate(word);
                System.out.println("Translation: " + (translation != null ? translation : "Word not found"));
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
    }
}
