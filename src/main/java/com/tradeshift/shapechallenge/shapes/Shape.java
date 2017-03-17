package com.tradeshift.shapechallenge.shapes;

/**
 * Basic interface containing the key necessary methods definition for the shape object 
 * @author egarcia
 *
 */
public interface Shape {
	
	/**
	 * Will return the type description for the created shape
	 * @return String containing the shape description
	 */
	public String getType();

	/**
	 * Return the value of the perimeter for the shape
	 * @return numeric value of the shape lenght
	 */
	public double getPerimeter();
	
	/**
	 * Validates the shape is well formed
	 * @throws runtime 
	 */
	public void validateShape();
}
