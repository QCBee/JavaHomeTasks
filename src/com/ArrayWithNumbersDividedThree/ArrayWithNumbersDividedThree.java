package com.ArrayWithNumbersDividedThree;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayWithNumbersDividedThree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the length of the array and press Enter. " +
                "The number should be from 10 till 100");
        int enteredSize = console.nextInt();

        generateArray(enteredSize);

    }

    //validate the input from user
    private static void generateArray(int enteredSize) {
        int summ = 0;
        if (enteredSize >= 10 & enteredSize <= 100) {
            //create 2 arrays for random numbers and multiple of 3
            int[] arraysNumber = new int[enteredSize];
            int[] threeMultipleNumbers = new int[enteredSize];

            //fill array with random numbers
            System.out.println("Generated numbers are ");
            for (int i = 0; i < arraysNumber.length; i++) {
                arraysNumber[i] = ThreadLocalRandom.current().nextInt(enteredSize);
                System.out.print(" " + arraysNumber[i]);

                //select only multiple of 3 numbers for second array
                if (arraysNumber[i] % 3 == 0) {
                    threeMultipleNumbers[i] = arraysNumber[i];
                }
            }

            System.out.println("\nNumbers multiple of 3 ");
            //ignoring the numbers that are not multiple of 3
            for (int i = 0; i < threeMultipleNumbers.length; i++) {
                if (threeMultipleNumbers[i] != 0) {
                    System.out.print(" " + threeMultipleNumbers[i]);
                }

            }

            //verify if array doesn't contain numbers multiple by 3
            for (int i = 0; i < threeMultipleNumbers.length; i++) {
                summ += +threeMultipleNumbers[i];
            }
            if (summ == 0) {
                System.out.println("Array doesn't contain numbers multiple of 3");
            }

        }
        //verify if user entered size less than 10 and bigger that 100
        else {
                System.out.println("You entered invalid size");
        }

    }

}
