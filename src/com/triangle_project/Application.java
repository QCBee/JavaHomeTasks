package com.triangle_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
        public static void main(java.lang.String[] args) {
            ArrayList<Triangle> triangleArrayList = new ArrayList<>(100000);

            for (int i = 0; i < 100000; i++) {
                Triangle triangle = new Triangle();
                triangleArrayList.add(triangle);

                Scanner console = new Scanner(System.in);
                System.out.println("Please select the type of triangle: "
                        + "\n 1 - Right-angled triangle - прямоугольный треугольник"
                        + "\n 2 - Equilateral triangle - равносторонний треугольник"
                        + "\n 3 - Isosceles triangle - равнобедренный треугольник"
                        + "\n 4 - Not equilateral triangle - произвольный треугольник");

                int selectedType = console.nextInt();
                switch (selectedType) {
                    case 1:
                        findTriangle(triangleArrayList, TriangleTypes.STRIGHT_ANGLE);
                        break;
                    case 2:
                        findTriangle(triangleArrayList, TriangleTypes.EQUILATERAL);
                        break;
                    case 3:
                        findTriangle(triangleArrayList, TriangleTypes.ISOSCELES);
                        break;
                    case 4:
                        System.out.println("The specific triangle isn't found. Would you try again?");
                        findTriangle(triangleArrayList, TriangleTypes.ARBITRARY);
                        //triangleSummary(4, triangleArrayList.get(0).getPerimeter(), triangleArrayList.get(0).getSquare());
                        break;
                }
            }
        }

        private static void findTriangle(ArrayList<Triangle> triangleArrayList, TriangleTypes triangleTypeList) {
            for (Triangle triangle : triangleArrayList) {
                TriangleTypes type = triangle.getTriangleType();
                int triangleIndex = triangleArrayList.indexOf(triangle);

                if (triangleTypeList == type) {
                    printTriangleSummary(triangleTypeList, triangle, triangleIndex);
                    break;
                }
            }
        }

        private static void printTriangleSummary(TriangleTypes triangleTypeList, Triangle triangle, int triangleIndex) {
            double perimeter = triangle.getPerimeter();
            double square = triangle.getSquare();
            Point firstPoint = triangle.getFirstPoint();
            Point secondPoint = triangle.getSecondPoint();
            Point thirdPoint = triangle.getThirdPoint();

            System.out.println("Найден " + triangleTypeList + " тип треугольника");
            System.out.println("Индекс:" + triangleIndex);
            System.out.println("Треугольник с координатами [a (" +
                    firstPoint.getCoordinateX() + ", " + firstPoint.getCoordinateY() +
                    "), b (" +
                    secondPoint.getCoordinateX() + ", " + secondPoint.getCoordinateY() +
                    "), c (" +
                    thirdPoint.getCoordinateX() + ", " + thirdPoint.getCoordinateY() + ")]");
            System.out.println("Периметр треугольника: " + perimeter);
            System.out.println("Площадь треугольника: " + square);
        }
    }
