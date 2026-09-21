package org.zarreen;

public class Exercise1 {

	public static void main(String[] args) {
		EquilateralTriangle triangle = new EquilateralTriangle(5);
        Square square = new Square(10);

        System.out.println("Triangle sides: " + triangle.getNumSides());
        System.out.println("Triangle side length: " + triangle.getSideLength());

        System.out.println("Square sides: " + square.getNumSides());
        System.out.println("Square side length: " + square.getSideLength());
	}

}

interface RegularPolygon {
    int getNumSides();
    double getSideLength();
}

class EquilateralTriangle implements RegularPolygon {

    private double sideLength;

    public EquilateralTriangle(double sideLength) {
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

class Square implements RegularPolygon {

    private double sideLength;

    public Square(double sideLength) {
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
