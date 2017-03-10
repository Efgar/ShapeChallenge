package com.tradeshift.shapechallenge.shapes;

public enum ShapeTypes {
	TRIANGLE_EQUILATERAL("Equilateral Triangle"), 
	TRIANGLE_ISOCELES("Isoceles Triangle"), 
	TRIANGLE_SCALENE("Scalene Triangle"), 
	QUADRILATERAL_REGULAR("Regular Quadrilateral"), 
	QUADRILATERAL_IRREGULAR("Irregular Quadrilateral");

	private String displayValue;

	private ShapeTypes(String displayValue) {
		this.displayValue = displayValue;
	}

	@Override
	public String toString() {
		return displayValue;
	}
}
