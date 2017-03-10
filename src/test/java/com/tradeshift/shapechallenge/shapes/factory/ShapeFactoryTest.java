package com.tradeshift.shapechallenge.shapes.factory;

import org.junit.Assert;
import org.junit.Test;

import com.tradeshift.shapechallenge.shapes.Shape;
import com.tradeshift.shapechallenge.shapes.ShapeTypes;

public class ShapeFactoryTest {

	@Test
	public void createShape() {
		Shape shape = ShapeFactory.createShape(new String[] { "1", "1", "1" });
		Assert.assertNotNull(shape);
	}
	
	@Test
	public void createTriangle() {
		Shape shape = ShapeFactory.createShape(new String[] { "1.1", "1", "1" });
		Assert.assertEquals(shape.getType(), ShapeTypes.TRIANGLE_ISOCELES.toString());
	}
	
	@Test
	public void createSquare() {
		Shape shape = ShapeFactory.createShape(new String[] { "1", "1", "1", "1" });
		Assert.assertEquals(shape.getType(), ShapeTypes.QUADRILATERAL_REGULAR.toString());
	}

	@Test(expected = IllegalArgumentException.class)
	public void createShapeEmptyArray() {
		ShapeFactory.createShape(new String[] {});
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createShapeNullArray() {
		ShapeFactory.createShape(null);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void createShapeSingleValueArray() {
		ShapeFactory.createShape(new String[] { "1"});
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void createShapeTooManyValuesArray() {
		ShapeFactory.createShape(new String[] { "1", "1", "1", "1", "1"});
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createShapeNonNumbersValuesArray() {
		ShapeFactory.createShape(new String[] { "a", "1", "1", "1"});
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createShapeNegativeNumbersValuesArray() {
		ShapeFactory.createShape(new String[] { "-1", "1", "1", "1"});
	}

}
