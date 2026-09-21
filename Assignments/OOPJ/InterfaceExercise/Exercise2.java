package org.zarreen;

public class Exercise2 {

	public static void main(String[] args) {
		EquilateralTriangle1 triangle = new EquilateralTriangle1(5);
        Square1 square = new Square1(10);

        System.out.println("Triangle sides: " + triangle.getNumSides());
        System.out.println("Triangle side length: " + triangle.getSideLength());

        System.out.println("Square sides: " + square.getNumSides());
        System.out.println("Square side length: " + square.getSideLength());
        
        RegularPolygon1[] polygons = {
        	    new EquilateralTriangle1(5),
        	    new Square1(10),
        	    new EquilateralTriangle1(7)
        	};

        	int total = RegularPolygon1.totalSides(polygons);

        	System.out.println("Total number of sides: " + total);
	}

}

interface RegularPolygon1 {
    int getNumSides();
    double getSideLength();
    
    static int totalSides(RegularPolygon1[] polygons) {

        int total = 0;

        for (RegularPolygon1 polygon : polygons) {
            total = total + polygon.getNumSides();
        }

        return total;
    }
}

class EquilateralTriangle1 implements RegularPolygon1 {

    private double sideLength;

    public EquilateralTriangle1(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public double getSideLength() {
        return sideLength;
    }
}

class Square1 implements RegularPolygon1 {

    private double sideLength;

    public Square1(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public double getSideLength() {
        return sideLength;
    }
}
