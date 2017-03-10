package com.tradeshift.shapechallenge.shapes;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTesting {
	@Test
	public void createTriangleSides() {
		Triangle triangle = new Triangle(1, 1, 1);
		Assert.assertNotNull(triangle);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createTriangleNegativeSides() {
		new Triangle(-1, 1, 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createTriangleZeroSides() {
		new Triangle(0, 1, 1);
	}

	@Test
	public void triangleGetType() {
		Triangle triangle = new Triangle(1, 1, 1);
		Assert.assertNotNull(triangle.getType());
	}

	@Test
	public void equilateralTriangleGetType() {
		Triangle triangle = new Triangle(1, 1, 1);
		Assert.assertEquals(ShapeTypes.TRIANGLE_EQUILATERAL.toString(), triangle.getType());
	}

	@Test
	public void isocelesTriangleGetType_1() {
		Triangle triangle = new Triangle(1, 1, 2);
		Assert.assertEquals(ShapeTypes.TRIANGLE_ISOCELES.toString(), triangle.getType());
	}

	@Test
	public void isocelesTriangleGetType_2() {
		Triangle triangle = new Triangle(1, 2, 1);
		Assert.assertEquals(ShapeTypes.TRIANGLE_ISOCELES.toString(), triangle.getType());
	}

	@Test
	public void isocelesTriangleGetType_3() {
		Triangle triangle = new Triangle(2, 1, 1);
		Assert.assertEquals(ShapeTypes.TRIANGLE_ISOCELES.toString(), triangle.getType());
	}

	@Test
	public void scaleneTriangleGetType() {
		Triangle triangle = new Triangle(1, 2, 3);
		Assert.assertEquals(ShapeTypes.TRIANGLE_SCALENE.toString(), triangle.getType());
	}

	@Test
	public void triangleGetPerimeter() {
		Triangle triangle = new Triangle(1, 1, 1);
		Assert.assertTrue(3.0 == triangle.getPerimeter());
	}
}
