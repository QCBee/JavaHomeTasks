package com.FirstTask;

public class FirstTask {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        int n = 4;


        long exp1 = getLongExpressionResult(x, y, z, n);
        int exp2 = getIntExpressionResult(x, y, z, n);
        float exp3 = getFloatExpressionResult(x, y, z, n);
        double exp4 = getDoubleExpressionResult(x, y, z, n);

        System.out.println(exp1);
        System.out.println(exp2);
        System.out.println(exp3);
        System.out.println(exp4);
    }

    private static long getLongExpressionResult(int x, int y, int z, int n) {
        return (long)(x - (y + 123) / z * n); // explicit conversion from double to long with truncating
    }

    private static int getIntExpressionResult(int x, int y, int z, int n) {
        return  ((x + (50 - y * z) / n) - x); // explicit conversion from double to int with truncating
    }

    private static float getFloatExpressionResult(int x, int y, int z, int n) {
        return (float)(x / ((y * (z - 1)) - 564) + n);
    }

    private static double getDoubleExpressionResult(int x, int y, int z, int n) {
        return (double)(-x /-y + z / (n + 15)); //implicit conversion without truncating
    }
}
