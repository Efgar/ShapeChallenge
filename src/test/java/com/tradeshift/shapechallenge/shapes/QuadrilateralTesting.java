package com.tradeshift.shapechallenge.shapes;

import org.junit.Assert;
import org.junit.Test;

public class QuadrilateralTesting {

	@Test
	public void createQuadrilateralSides() {
		Quadrilateral square = new Quadrilateral(1, 1, 1, 1);
		Assert.assertNotNull(square);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createQuadrilateralNegativeSides() {
		new Quadrilateral(-0.1, 1, 1, 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createQuadrilateralZeroSides() {
		new Quadrilateral(0, 1, 1, 1);
	}

	@Test
	public void quadrilateralGetType() {
		Quadrilateral square = new Quadrilateral(1, 1, 1, 1);
		Assert.assertNotNull(square.getType());
	}

	@Test
	public void quadrilateralRegularGetType_1() {
		Quadrilateral square = new Quadrilateral(1, 2, 1, 2);
		Assert.assertEquals(ShapeTypes.QUADRILATERAL_REGULAR.toString(), square.getType());
	}

	@Test
	public void quadrilateralRegularGetType_2() {
		Quadrilateral square = new Quadrilateral(1, 1, 1, 1);
		Assert.assertEquals(ShapeTypes.QUADRILATERAL_REGULAR.toString(), square.getType());
	}

	@Test
	public void quadrilateralIrregularGetType_1() {
		Quadrilateral square = new Quadrilateral(1, 2, 3, 4);
		Assert.assertEquals(ShapeTypes.QUADRILATERAL_IRREGULAR.toString(), square.getType());
	}

	@Test
	public void quadrilateralIrregularGetType_2() {
		Quadrilateral square = new Quadrilateral(1, 1, 3, 4);
		Assert.assertEquals(ShapeTypes.QUADRILATERAL_IRREGULAR.toString(), square.getType());
	}

	@Test
	public void quadrilateralGetPerimeter() {
		Quadrilateral triangle = new Quadrilateral(1, 1, 1, 1);
		Assert.assertTrue(4.0 == triangle.getPerimeter());
	}
}
