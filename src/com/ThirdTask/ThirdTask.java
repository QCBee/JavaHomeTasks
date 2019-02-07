package com.ThirdTask;

public class ThirdTask {
    public static void main(String[] args) {
        String text;

        {
            text = "Единичный вектор для вектора";
        }

        int x = 5;
        int y = 0;
        int z = 0;
        int step = 2;

        double d = VectorLength (x, y, z, step);
        double x1 = NewXCoordinate (x, d);
        double y1 = NewYCoordinate (y, d);
        double z1 = NewZCoordinate (z, d);

        System.out.println(text + " (" + x + ", " + y +", " + z + ") => (" + x1 + ", " + y1 + ", " + z1 + ")");

    }

        private static double VectorLength (int x, int y, int z, int step) {
            return Math.sqrt(Math.pow(x, step) + Math.pow(y, step) + Math.pow(z, step)); //calculates the length of vector
        }

        private static double NewXCoordinate (int x, double d) {
            return (int) (x / d); // calculate the X coordinate for unit vector
        }

        private static double NewYCoordinate (int y, double d) {
            return (int) (y / d); // calculate the Y coordinate for unit vector
        }

        private static double NewZCoordinate (int z, double d) {
            return (int) (z / d); // calculate the Z coordinate for unit vector
        }

}
