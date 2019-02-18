package com.Palindrom;

import java.util.Scanner;


public class Palindrom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the word and press Enter");
        String enteredWord = console.next();
        boolean isEnteredWordPalindrome = verifyPalindrome(enteredWord);

        if (isEnteredWordPalindrome) {
            System.out.println("You entered a palindrome");
        } else {
            System.out.println("You entered NOT a palindrome");
        }
    }

    private static boolean verifyPalindrome(String enteredWord) {
        StringBuilder reversedWord = new StringBuilder();
        reversedWord.append(enteredWord);

        for (int i = 0; i < enteredWord.length(); i++) {
            if (reversedWord.reverse().charAt(i) == enteredWord.charAt(i)) {
                System.out.println("Characters are equal on index " + i);
            } else {
                return false;
            }
        }

        return true;
    }
}

