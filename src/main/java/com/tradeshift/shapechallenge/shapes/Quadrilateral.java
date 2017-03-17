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

	public Quadrilateral(double sideA, double sideB, double sideC, double sideD) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		this.sideD = sideD;
		validateShape();
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

	public void validateShape() {
		if (sideA <= 0 || sideB <= 0 || sideC <= 0 || sideD <= 0) {
			throw new IllegalArgumentException("One of the received sides is lesser or equal to zero");
		}
		
		if (this.sideA + this.sideB + this.sideC < this.sideD
				|| this.sideD + this.sideA + this.sideB < this.sideC
				|| this.sideC + this.sideD + this.sideA < this.sideB
				|| this.sideB + this.sideC + this.sideD < this.sideA) {
			throw new IllegalArgumentException("Non valid shape sides");
		}
	}

}
