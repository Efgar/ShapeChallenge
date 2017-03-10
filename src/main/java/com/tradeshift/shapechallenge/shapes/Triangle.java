package com.tradeshift.shapechallenge.shapes;

/**
 * Specific Shape implementation for a triangle
 * @author egarcia
 *
 */
public class Triangle implements Shape {

	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(double sideA, double sideB, double sideC) {
		if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
			throw new IllegalArgumentException("One of the received sides is lesser or equal to zero");
		}
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public String getType() {
		if (isEquilateral()) {
			return ShapeTypes.TRIANGLE_EQUILATERAL.toString();
		} else if (isScalene()) {
			return ShapeTypes.TRIANGLE_ISOCELES.toString();
		} else {
			return ShapeTypes.TRIANGLE_SCALENE.toString();
		}
	}

	private boolean isEquilateral() {
		return sideA == sideB && sideB == sideC;
	}

	private boolean isScalene() {
		return (sideA == sideB && sideA != sideC) || (sideB == sideC && sideB != sideA)
				|| (sideC == sideA && sideC != sideB);
	}

	public double getPerimeter() {
		return sideA + sideB + sideC;
	}
}
