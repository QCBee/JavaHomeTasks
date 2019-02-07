package com.FirstTask;

public class FirstTask {
    public static void main(String[] args) {
        float x = 1;
        float y = 2;
        float z = 3;
        float n = 4;


        long exp1 = GetLongExpressionResult(x, y, z, n);
        int exp2 = GetIntExpressionResult(x, y, z, n);
        float exp3 = GetFloatExpressionResult(x, y, z, n);
        double exp4 = GetDoubleExpressionResult(x, y, z, n);

        System.out.println(exp1);
        System.out.println(exp2);
        System.out.println(exp3);
        System.out.println(exp4);
    }

    private static long GetLongExpressionResult(float x, float y, float z, float n) {
        return (long)(x - (y + 123) / z * n); // explicit conversion from double to long with truncating
    }

    private static int GetIntExpressionResult(float x, float y, float z, float n) {
        return  (int)((x + (50 - y * z) / n) - x); // explicit conversion from double to int with truncating
    }

    private static float GetFloatExpressionResult(float x, float y, float z, float n) {
        return (x / ((y * (z - 1)) - 564) + n);
    }

    private static double GetDoubleExpressionResult(float x, float y, float z, float n) {
        return (-x /-y + z / (n + 15)); //implicit conversion without truncating
    }
}
