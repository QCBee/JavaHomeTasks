package com.triangle_project;

public class Triangle {

    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;

    public Triangle() {
        firstPoint = new Point();
        secondPoint = new Point();
        thirdPoint = new Point();

    }

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public Point getThirdPoint() {
        return thirdPoint;
    }

    public double getFirstSide() {
        return firstPoint.getDistanceTo(secondPoint);
    }

    public double getSecondSide() {
        return secondPoint.getDistanceTo(thirdPoint);
    }

    public double getThirdSide() {
        return thirdPoint.getDistanceTo(firstPoint);
    }

    public double getAngle(double firstSide, double secondSide, double thirdSide) {

        return (Math.pow(firstSide, 2) + Math.pow(secondSide, 2) - Math.pow(thirdSide, 2)) / (2 * firstSide * secondSide);
    }

    private boolean isTriangle() {
        double ab = getFirstSide();
        double ac = getThirdSide();
        double bc = getSecondSide();

        return ((ab + bc) > ac) && ((ab + ac) > bc) && ((bc + ac) > ab);
        //TODO: add try/catch check
    }

    public double getPerimeter() {
        return getFirstSide() + getSecondSide() + getThirdSide();
    }

    public double getSquare() {
        double semiperimetr = getPerimeter() / 2;
        double ab = getFirstSide();
        double ac = getThirdSide();
        double bc = getSecondSide();

        if (((Math.cos(getAngle(ab, ac, bc)) == 1)
                || ((Math.cos(getAngle(ac, bc, ab))) == 1)
                || ((Math.cos(getAngle(bc, ab, ac)) == 1)))) {
            if (ab > ac && ab > bc)
                return (semiperimetr - ac) * (semiperimetr - bc);
            else if (ac > ab && ac > bc)
                return (semiperimetr - ab) * (semiperimetr - bc);
            else
                return (semiperimetr - ab) * (semiperimetr - ac);
        }

        return Math.sqrt(semiperimetr * (semiperimetr - ab) * (semiperimetr - ac) * (semiperimetr - bc));
    }

    public TriangleTypes getTriangleType() {
        double ab = getFirstSide();
        double ac = getSecondSide();
        double bc = getThirdSide();

        if (ab == ac && ac == bc)
            return TriangleTypes.EQUILATERAL;
        else if (bc == ab)
            return TriangleTypes.ISOSCELES;
        else if (Math.cos(getAngle(ab, ac, bc)) == 1 || Math.cos(getAngle(ac, bc, ab)) == 1 || Math.cos(getAngle(bc, ab, ac)) == 1)
            return TriangleTypes.STRIGHT_ANGLE;

        return TriangleTypes.STRIGHT_ANGLE;
    }
}


