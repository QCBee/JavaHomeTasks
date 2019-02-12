package com.TaskPractice_Second;

import java.util.Scanner;

public class TaskPractice_Second {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите время в минутах и нажмите Enter");
        int timeInMinutes = console.nextInt();

        System.out.println("Введите растояние в киллометрах и нажмите Enter");
        double distanceInKm = console.nextFloat();

        double convertedTime = convertMinutesToSecond (timeInMinutes);
        double convertedDistance = convertKmToM (distanceInKm);

        double speed = findSpeed (convertedDistance, convertedTime);

        System.out.println("Ваша скорость движения составляет " + speed + " м/с");
        }

    public static double convertMinutesToSecond (double timeInMinutes) {
        return timeInMinutes * 60;
    }

    public static double convertKmToM (double distanceInKm) {
        return Math.round(distanceInKm * 1000);
    }

    public static double findSpeed (double convertedDistance, double convertedTime) {
        return convertedDistance / convertedTime;
    }
}

