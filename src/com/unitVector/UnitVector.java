package com.unitVector;
/*Напишите программу, которая для 3-х координат вектора x, y, и z, с основанием у начала координат вычисляет единичный вектор и выводит его на консоль.

        Для нахождения единичного вектора, нужно посчитать длину исходного вектора и разделить каждую из координат на его длину.

        Длина вектора - Math.sqrt(X  X + Y  Y + Z * Z)

        Пример:
        Единичный вектор для вектора (5, 0, 0) => (1, 0, 0)

        Каждая из программ должна быть реализована в отдельном классе с методом main.*/

public class UnitVector {
    public static void main(String[] args) {
        String text;

        {
            text = "Единичный вектор для вектора";
        }

        int x = 5;
        int y = 0;
        int z = 0;
        int step = 2;

        double d = findVectorLength (x, y, z, step);
        double x1 = findNewXCoordinate (x, d);
        double y1 = findNewYCoordinate (y, d);
        double z1 = findNewZCoordinate (z, d);

        System.out.println(text + " (" + x + ", " + y +", " + z + ") => (" + x1 + ", " + y1 + ", " + z1 + ")");

    }

        private static double findVectorLength (int x, int y, int z, int step) {
            return Math.sqrt(Math.pow(x, step) + Math.pow(y, step) + Math.pow(z, step));
        }

        private static double findNewXCoordinate (int x, double d) {
            return (int) (x / d);
        }

        private static double findNewYCoordinate (int y, double d) {
            return (int) (y / d);
        }

        private static double findNewZCoordinate (int z, double d) {
            return (int) (z / d);
        }

}
