package com.TaskPractice_Second;

import java.util.Scanner;

public class TaskPractice_Second {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите время в минутах и нажмите Enter");
        int TimeInMinutes = console.nextInt();

        System.out.println("Введите растояние в киллометрах и нажмите Enter");
        double DistanceInKm = console.nextFloat();

        double ConvertedTime = convertMinutesToSecond (TimeInMinutes);
        double ConvertedDistance = convertKmToM (DistanceInKm);

        double Speed = findSpeed (ConvertedDistance, ConvertedTime);

        System.out.println("Ваша скорость движения составляет " + Speed + "м/с");
        }

    public static double convertMinutesToSecond (double TimeInMinutes) {
        return TimeInMinutes * 60;
    }

    public static double convertKmToM (double DistanceInKm) {
        return Math.round(DistanceInKm * 1000);
    }

    public static double findSpeed (double ConvertedDistance, double ConvertedTime) {
        return ConvertedDistance / ConvertedTime;
    }
}

