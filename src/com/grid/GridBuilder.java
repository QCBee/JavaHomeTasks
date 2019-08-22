package com.grid;

import java.util.Scanner;

public class GridBuilder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of spaces. Number should be multiple of 3 and in the diapason from 3 till 9");
        int userInput = Integer.parseInt(console.next());
        buildSquare(userInput);
    }

    private static void buildSquare(int userInput) {
        if (userInput < 3 | userInput > 9) {//verify invalid entered data
            System.out.println("You entered invalid numbers of spaces");
        }
        //verify valid data and build the square
        else {
            switch (userInput) {
                case 3:
                    for (int i = 0; i < (userInput * 3); i++) {//build the height
                        for (int j = 0; j < ((userInput * 4) + 5); j++) { //build the line that contains only stars
                            if (i % 2 == 0) {
                                System.out.print("*");
                            } else {
                                if (j <= userInput + 1) {
                                    System.out.print("*");
                                    for (int k = 0; k < userInput; k++) {//build the line that contains stars and spaces
                                        System.out.print(" ");
                                    }
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for (int i = 0; i < (userInput * 2) + 1; i++) {
                        for (int j = 0; j < (userInput * 4) + 5; j++) {
                            if (i % 3 == 0) {
                                System.out.print("*");
                            } else {
                                if (j <= userInput - 2) {
                                    System.out.print("*");
                                    for (int k = 0; k < userInput; k++) {
                                        System.out.print(" ");
                                    }
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 9:
                    for (int i = 0; i < (userInput * 2) -1; i++) {
                        for (int j = 0; j < (userInput * 4) +5; j++) {
                            if (i % 4 == 0) {
                                System.out.print("*");
                            }
                            else {
                                if (j <= userInput - 5)
                                System.out.print("*");
                                for (int k = 0; k < userInput; k++) {
                                    System.out.print(" ");
                                }
                            }
                        }
                        System.out.println();
                        
                    }
                    break;
                    default:
                        System.out.println("You entered number that is NOT multiple of 3");
            }
        }
    }
}




