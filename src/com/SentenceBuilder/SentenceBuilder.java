package com.SentenceBuilder;

import java.util.Scanner;

public class SentenceBuilder {
    public static void main (String [] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the sentence and press Enter");
        StringBuilder enteredSentence = new StringBuilder();

        enteredSentence.append(console.nextLine());

        divideSentence(enteredSentence.reverse());
    }

    private static void divideSentence (StringBuilder enteredSentence) {
        String[] foundWords = enteredSentence.toString().split(" ");

        for (int i = 0; i < foundWords.length ; i++) {
            System.out.print(foundWords[i] + " ");
        }

        System.out.println("\n");
    }
}
