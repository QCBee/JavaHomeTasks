package com.TaskPractice;

import java.util.Scanner;

public class Task_Practice {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите стоимость 1 кг конфет и нажмите Enter:");
        float CandyPrice = console.nextFloat();

        System.out.println("Введите стоимость 1 кг печенья и нажмите Enter:");

        float CookyPrice = console.nextFloat();
        float FistPurchase = calculateFirstPurchase (CandyPrice, CookyPrice);

        System.out.println("Стоимость первой покупки " + FistPurchase);

        float SecondPurchase = calculateSecondPurchase(CandyPrice, CookyPrice);

        System.out.println("Стоимость второй покупки " + SecondPurchase);

    }

    public static float calculateFirstPurchase (float CandyPrice, float CookyPrice) {
        return Math.round((0.3f * CandyPrice + 0.4f * CookyPrice));
    }
    public static float calculateSecondPurchase (float CandyPrice, float CookyPrice) {
        return Math.round(3*(1.8f * CandyPrice + 2f * CookyPrice));
    }


}
