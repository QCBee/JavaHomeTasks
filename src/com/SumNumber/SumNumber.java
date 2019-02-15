/*package com.SumNumber;


public class SumNumber {
    public static void main(String[] args) {
        long value = 15875;
        long dividedSum = decomposeValue(value, 0);

        System.out.println(value + " => " + dividedSum);
    }


    private static long decomposeValue(long value, long dividedSum) {
        if (value > 0) {
            return decomposeValue(value / 10, value % 10 + dividedSum);
        }
        return dividedSum;
    }
}


*/

