package com.equation;

/*Написать программу решающую следующие уравнения. Переменные x,y,z,n инициализируется перед решением уравнения. Каждое решение оформить в отдельном статическом методе.
        x - (y + 123) / z * n  		=> считаем в long
        (x + (50 - y * z) / n) - x 	=> считаем в int
        x / (y * (z - 1) - 564) + n 	=> считаем в float
        -x / -y + z / (n + 15) 		=> считаем в double
       Каждая из программ должна быть реализована в отдельном классе с методом main.*/

public class Equation {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        int n = 4;

        long equation1 = getLongEquationResult(x, y, z, n);
        int equation2 = getIntEquationResult(x, y, z, n);
        float equation3 = getFloatEquationResult(x, y, z, n);
        double equation4 = getDoubleEquationResult(x, y, z, n);

        System.out.println(equation1);
        System.out.println(equation2);
        System.out.println(equation3);
        System.out.println(equation4);
    }

    private static long getLongEquationResult(int x, int y, int z, int n) {
        return (long)(x - (y + 123) / z * n);
    }


    private static int getIntEquationResult(int x, int y, int z, int n) {
        return  ((x + (50 - y * z) / n) - x);
    }

    private static float getFloatEquationResult(int x, int y, int z, int n) {
        return (float)(x / ((y * (z - 1)) - 564) + n);
    }

    private static double getDoubleEquationResult(int x, int y, int z, int n) {
        return (double)(-x /-y + z / (n + 15));
    }
}
