package P05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Problem5 {

//	@DisplayName("Point Class Test")
//	@Test
//	public void testAdd() {
//		Point p1 = new Point(3, 5);
//		Point p2 = new Point(2, 4);
//		Point resultAdd = p1.add(p2);
//		assertEquals(5, resultAdd.x);
//		assertEquals(9, resultAdd.y);
//
//		Point resultSub = p1.sub(p2);
//		assertEquals(1, resultSub.x);
//		assertEquals(1, resultSub.y);
//	}
//
//	@DisplayName("Vector Class Test")
//	@Test
//	public void testDotProduct() {
//		Vector2D v1 = new Vector2D(3, 4);
//		Vector2D v2 = new Vector2D(2, 1);
//		int result = v1.dotProduct(v2);
//		assertEquals(10, result);
//	}
//
//	@DisplayName("Vector Class Test")
//	@Test
//	public void testIsOrthogonalTo() {
//		Vector2D v1 = new Vector2D(1, 0);
//		Vector2D v2 = new Vector2D(0, 1);
//		boolean resultOrthogonal = v1.isOrthogonalTo(v2);
//		assertTrue(resultOrthogonal);
//
//		Vector2D v3 = new Vector2D(3, 4);
//		boolean resultNoOrthogonal = v1.isOrthogonalTo(v3);
//		assertFalse(resultNoOrthogonal);
//	}
//
//	@DisplayName("Line Class Test")
//	@Test
//	public void testGetVector() {
//		Point p1 = new Point(1, 2);
//		Point p2 = new Point(3, 4);
//		Line line = new Line(p1, p2);
//		Vector2D vector = line.getVector();
//		assertEquals(2, vector.x);
//		assertEquals(2, vector.y);
//	}
//
//	@DisplayName("Line Class Test")
//	@Test
//	public void testGetLength() {
//		Point p1 = new Point(1, 2);
//		Point p2 = new Point(4, 6);
//		Line line = new Line(p1, p2);
//		double length = line.getLength();
//		assertEquals(5.0, length);
//	}
//
//	@DisplayName("Line Class Test")
//	@Test
//	public void testIsSameLengthAs() {
//		Point p1 = new Point(1, 2);
//		Point p2 = new Point(4, 6);
//		Line line1 = new Line(p1, p2);
//
//		Point p3 = new Point(0, 0);
//		Point p4 = new Point(3, 4);
//		Line line2 = new Line(p3, p4);
//
//		assertTrue(line1.isSameLengthAs(line2));
//	}
//
	@DisplayName("Quadrilateral Class - Rectangle Test")
	@Test
	public void testIsRectangle() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 4);
		Point p3 = new Point(3, 4);
		Point p4 = new Point(3, 0);

		Quadrilateral quadrilateral = new Quadrilateral(p1, p2, p3, p4);
		assertTrue(quadrilateral.isRectangle());
	}

	@DisplayName("Quadrilateral Class - Square Test")
	@Test
	public void testIsSquare() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 4);
		Point p3 = new Point(4, 4);
		Point p4 = new Point(4, 0);

		Quadrilateral quadrilateral = new Quadrilateral(p1, p2, p3, p4);
		assertTrue(quadrilateral.isSquare());
	}
}
