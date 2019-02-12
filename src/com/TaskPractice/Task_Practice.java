package com.TaskPractice;

import java.util.Scanner;

public class Task_Practice {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите стоимость 1 кг конфет и нажмите Enter:");
        float candyPrice = console.nextFloat();

        System.out.println("Введите стоимость 1 кг печенья и нажмите Enter:");

        float cookyPrice = console.nextFloat();
        float fistPurchase = calculateFirstPurchase (candyPrice, cookyPrice);

        System.out.println("Стоимость первой покупки " + fistPurchase);

        float secondPurchase = calculateSecondPurchase(candyPrice, cookyPrice);

        System.out.println("Стоимость второй покупки " + secondPurchase);

    }

    public static float calculateFirstPurchase (float candyPrice, float cookyPrice) {
        return Math.round((0.3f * candyPrice + 0.4f * cookyPrice));
    }
    public static float calculateSecondPurchase (float candyPrice, float cookyPrice) {
        return Math.round(3*(1.8f * candyPrice + 2f * cookyPrice));
    }


}
