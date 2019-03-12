package com.interviewQuantity;

import java.util.Scanner;
    public class InterviewQuantity{


    public static void main(String[] args) {
        Scanner enteredQuantity = new Scanner(System.in);
        System.out.println("Please enter the quantity of employee and press Enter");
        int numberOfProgrammers = enteredQuantity.nextInt();
        calculateNumberOfInterviews(numberOfProgrammers);
        System.out.println("Quantity of interviews in the company is "
                + calculateNumberOfInterviews(numberOfProgrammers));
        }

    private static int calculateNumberOfInterviews(int numberOfProgrammers){
        if(numberOfProgrammers >= 1){
            return calculateNumberOfInterviews(numberOfProgrammers - 1) +
                    (numberOfProgrammers - 1);
        }
        else{
            return numberOfProgrammers;

        }
    }
}






