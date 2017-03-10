package com.tradeshift.shapechallenge.shapes;

/**
 * Specific Shape implementation for a Quadrilateral
 * @author egarcia
 *
 */
public class Quadrilateral implements Shape {

	private double sideA;
	private double sideB;
	private double sideC;
	private double sideD;

	public Quadrilateral(double sideA, double sideB, double sideC, double side4) {
		if (sideA <= 0 || sideB <= 0 || sideC <= 0 || side4 <= 0) {
			throw new IllegalArgumentException("One of the received sides is lesser or equal to zero");
		}
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		this.sideD = side4;
	}

	public String getType() {
		if (isRegular()) {
			return ShapeTypes.QUADRILATERAL_REGULAR.toString();
		} else {
			return ShapeTypes.QUADRILATERAL_IRREGULAR.toString();
		}
	}

	private boolean isRegular() {
		return sideA == sideC && sideB == sideD;
	}

	public double getPerimeter() {
		return sideA + sideB + sideC + sideD;
	}

}
