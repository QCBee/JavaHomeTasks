package com.company;

import java.util.Scanner;

public class SquareBuilder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of spaces");
        int userInput = Integer.parseInt(console.next());

        buildSquare(userInput);
//        System.out.println(fullString);
//        System.out.println(spacedString);
//        System.out.println(fullString);
//        System.out.println(spacedString);
//        System.out.println(fullString);
    }

    private static void buildSquare(int userInput) {
//        for (int i = 1; i < (userInput * 4 + (walls - 1)); i++){
////            System.out.println();
//
//            if (i % 2 == 0)
//                System.out.print("*   *");
//            else
//                System.out.print("*");
//
//            for (int j = 1; j <(userInput+1); j++){
//                System.out.println();
//            }
//
//        }

        //  if (userInput >= 3 && userInput <= 9) {
        for (int i = 0; i < (userInput + 2) / 3; i++) {
            for (int j = 0; j < userInput + 2; j++) {
                if (i % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("*");

                    for (int k = 0; k < userInput; k++) {
                        System.out.print(" ");
                    }

                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}






