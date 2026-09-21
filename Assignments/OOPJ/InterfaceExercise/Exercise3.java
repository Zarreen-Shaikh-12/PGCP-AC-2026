package org.zarreen;

public class Exercise3 {

	public static void main(String[] args) {
		EquilateralTriangle2 triangle = new EquilateralTriangle2(5);
        Square2 square = new Square2(10);

        System.out.println("Triangle sides: " + triangle.getNumSides());
        System.out.println("Triangle side length: " + triangle.getSideLength());

        System.out.println("Square sides: " + square.getNumSides());
        System.out.println("Square side length: " + square.getSideLength());
        
        RegularPolygon2[] polygons = {
        	    new EquilateralTriangle2(5),
        	    new Square2(10),
        	    new EquilateralTriangle2(7)
        	};

        	int total = RegularPolygon2.totalSides(polygons);

        	System.out.println("Total number of sides: " + total);
        	
        	System.out.println("Perimeter: " + triangle.getPerimeter());

            System.out.println("Interior angle: " + triangle.getInteriorAngle());
            
            System.out.println("Perimeter: " + square.getPerimeter());

            System.out.println("Interior angle: " + square.getInteriorAngle());
	}

}

interface RegularPolygon2 {
    int getNumSides();
    double getSideLength();
    
    static int totalSides(RegularPolygon2[] polygons) {

        int total = 0;

        for (RegularPolygon2 polygon : polygons) {
            total = total + polygon.getNumSides();
        }

        return total;
    }
    
    default double getPerimeter() {
        return getNumSides() * getSideLength();
    }
    
    default double getInteriorAngle() {
        return (getNumSides() - 2) * Math.PI / getNumSides();
    }
}

class EquilateralTriangle2 implements RegularPolygon2 {

    private double sideLength;

    public EquilateralTriangle2(double sideLength) {
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

class Square2 implements RegularPolygon2 {

    private double sideLength;

    public Square2(double sideLength) {
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
