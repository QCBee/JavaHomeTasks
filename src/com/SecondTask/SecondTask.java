package com.SecondTask;

public class SecondTask {
    public static void main(String[] args) {
        int value = 45685;
        int m1 = 10000; //multiplier for numbers in format XX XXX
        int m2 = 1000; //multiplier for numbers in format X XXX
        int m3 = 100; //multiplier for numbers in format XXXX
        int m4 = 10; //multiplier for numbers in format XX

        int first_value = Cut10ThousendthNumber(value, m1);
        int second_value = Cut1ThousendthNumber(first_value,value, m1, m2);
        int third_value = Cut1HundredthNumber (first_value,second_value,value, m1, m2, m3);
        int forth_value = CutTenthNumber(first_value, second_value,third_value,value, m1, m2, m3, m4);
        int fifth_value = GetLastNumber(first_value, second_value, third_value, forth_value,value, m1, m2, m3, m4);

        System.out.println(value);
        System.out.println(first_value);
        System.out.println(second_value);
        System.out.println(third_value);
        System.out.println(forth_value);
        System.out.println(fifth_value);

    }
    private static int Cut10ThousendthNumber(int value, int m1) {
       return value/m1; // divides 45685 into 10000 and returns 4
    }

    private static int Cut1ThousendthNumber (int  first_value, int value, int m1, int m2) {
        return (value - (first_value * m1)) / m2; //divides 5685 into 1000 and returns  5
    }

    private static int Cut1HundredthNumber (int first_value, int second_value, int value, int m1, int m2, int m3) {
        return (value - (first_value*m1)-(second_value*m2))/m3; //divides 685 into and returns 100 -> 6
    }

    private static int CutTenthNumber (int first_value, int second_value, int third_value, int value, int m1, int m2, int m3, int m4) {
        return (value - (first_value*m1)-(second_value*m2)-(third_value*m3))/m4;//divides 85 into 10 and returns 8
    }

    private static int GetLastNumber (int first_value, int second_value, int third_value, int forth_value, int value, int m1, int m2, int m3, int m4) {
        return (value - (first_value*m1)-(second_value*m2) - (third_value*m3) - (forth_value*m4)); // returns 5

    }


}
