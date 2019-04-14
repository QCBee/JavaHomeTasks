package com.triangle_project;

import java.util.concurrent.ThreadLocalRandom;

public class Point {

    private double coordinateX;
    private double coordinateY;


    public Point() {
        coordinateY = ThreadLocalRandom.current().nextDouble();
        coordinateY = ThreadLocalRandom.current().nextDouble();
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public double getDistanceTo(Point point) {
        return Math.sqrt(Math.pow(coordinateX - point.coordinateX, 2) +
                Math.pow(coordinateY - point.coordinateY, 2));
    }
}



