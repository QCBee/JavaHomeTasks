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

        double d = findVectorLength (x, y, z, step);
        double x1 = findNewXCoordinate (x, d);
        double y1 = findNewYCoordinate (y, d);
        double z1 = findNewZCoordinate (z, d);

        System.out.println(text + " (" + x + ", " + y +", " + z + ") => (" + x1 + ", " + y1 + ", " + z1 + ")");

    }

        private static double findVectorLength (int x, int y, int z, int step) {
            return Math.sqrt(Math.pow(x, step) + Math.pow(y, step) + Math.pow(z, step)); //calculates the length of vector
        }

        private static double findNewXCoordinate (int x, double d) {
            return (int) (x / d); // calculate the X coordinate for unit vector
        }

        private static double findNewYCoordinate (int y, double d) {
            return (int) (y / d); // calculate the Y coordinate for unit vector
        }

        private static double findNewZCoordinate (int z, double d) {
            return (int) (z / d); // calculate the Z coordinate for unit vector
        }

}
