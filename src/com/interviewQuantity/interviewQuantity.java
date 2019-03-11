package com.interviewQuantity;

import java.util.Scanner;

public class interviewQuantity {
    public static void main(String[] args) {
        Scanner quantityOfEmployee = new Scanner(System.in);
        System.out.println("Please enter the quantity of employee and press Enter");
        int enteredQuantity = quantityOfEmployee.nextInt();
        int quantityOfInterviews = 0;
        calculateQuantityOfInterviews(enteredQuantity, quantityOfInterviews);
        System.out.println(quantityOfInterviews);
    }


    public static int calculateQuantityOfInterviews(int enteredQuantity, int quantityOfInterview) {

        while (enteredQuantity > 1) {
            quantityOfInterview += enteredQuantity;
            enteredQuantity --;
        }
        return quantityOfInterview;
    }
}








