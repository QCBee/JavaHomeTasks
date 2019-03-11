package com.ArrayWithNumbersDividedThree;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayWithNumbersDividedThree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the length of the array and press Enter. " +
                "The number should be from 10 till 100");

        generateArray(console.nextInt());
    }

    private static void generateArray(int enteredSize) {
        int[] arraysNumber = new int[enteredSize];
        int[] threeMultipleNumbers = new int[enteredSize];
        
        System.out.println("Generated numbers are ");
        for (int i = 0; i < arraysNumber.length; i++) {
            arraysNumber[i] = ThreadLocalRandom.current().nextInt(enteredSize);
            System.out.print(" " + arraysNumber[i]);

            if (arraysNumber[i] % 3 == 0)
                threeMultipleNumbers[i] = arraysNumber[i];
        }

        System.out.println("\nNumbers multiple of 3 ");
        for (int i = 0; i < threeMultipleNumbers.length; i++) {
            if (threeMultipleNumbers[i] != 0)
                System.out.print(" " + threeMultipleNumbers[i]);
        }
        
        System.out.println();
    }
}