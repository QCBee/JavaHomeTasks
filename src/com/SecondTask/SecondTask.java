package com.SecondTask;

public class SecondTask {
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
