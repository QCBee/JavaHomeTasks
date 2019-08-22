package com.decomposedNumber;
/*Составить программу, которая будет разлаживать 5-ти значное число на отдельные цифры данного числа, слева-направо. Число задается в параметре статического метода.
        Каждую цифру вывести в отдельной строке.
        45685
        4
        5
        6
        8
        5
        Каждая из программ должна быть реализована в отдельном классе с методом main.*/

public class DecomposedNumber {
    public static void main(String[] args) {
        int value = 45685;
        decomposeValue(value);
    }

    private static void decomposeValue(int value) {
        if (value > 0){
            decomposeValue(value/10);
            System.out.println(value%10);
        }
    }
}
