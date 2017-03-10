package com.tradeshift.shapechallenge.shapes.factory;

import com.tradeshift.shapechallenge.shapes.Quadrilateral;
import com.tradeshift.shapechallenge.shapes.Shape;
import com.tradeshift.shapechallenge.shapes.Triangle;

/**
 * Factory to be used in the Shapes creation
 * @author egarcia
 *
 */
public class ShapeFactory {

	/**
	 * This class create a shape by reading the received sides array
	 * 
	 * @param sides String array containing the shape sizes
	 * @return a Shape object, the specific implementation (i.e triangle, square) is given by the amount of sides received
	 */
	public static Shape createShape(String sides[]) {

		if (sides == null || sides.length == 0) {
			throw new IllegalArgumentException("You have enter no values");
		}

		for (String side : sides) {
			if (!side.matches("\\d+(\\.\\d{1,2})?")) {
				throw new IllegalArgumentException("You have enter a invalid character");
			}
		}

		if (sides.length == 3) {
			return new Triangle(Double.parseDouble(sides[0]), Double.parseDouble(sides[1]),
					Double.parseDouble(sides[2]));
		}

		if (sides.length == 4) {
			return new Quadrilateral(Double.parseDouble(sides[0]), Double.parseDouble(sides[1]),
					Double.parseDouble(sides[2]), Double.parseDouble(sides[3]));
		}

		throw new UnsupportedOperationException(
				"The shape for the specified amount of sides " + sides.length + " is not yet implemented");
	}

}
