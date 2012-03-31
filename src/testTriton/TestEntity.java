package testTriton;

import static org.junit.Assert.fail;

import java.awt.Image;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import triton.Entity;

public class TestEntity {
	class MockEntity extends Entity {

		public MockEntity(Rectangle2D hitBox) {
			super(null, hitBox);
		}

		@Override
		public void colide(Entity other) {}

		@Override
		public void colisionReact(Entity other) {}

		@Override
		public void tick() {}
		
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMove() {
		MockEntity e = new MockEntity(null);
		e.move(new Point2D.Double(10, 20));
		Assert.assertEquals(new Point2D.Double(20, 10), e.getLocation());
		e.move(new Point2D.Double(3.3, 9.2));
		Assert.assertEquals(new Point2D.Double(3.3, 9.2), e.getLocation());
	}

	@Test
	public void testIsCollidingWith() {
		MockEntity e = new MockEntity(new Rectangle2D.Double(-20, -20, 40, 40));
		MockEntity o1 = new MockEntity(new Rectangle2D.Double(-20, -20, 40, 40));
		MockEntity o2 = new MockEntity(new Rectangle2D.Double(-20, -20, 40, 40));
		e.move(new Point2D.Double(50, 50));
		o1.move(new Point2D.Double(100, 100));
		Assert.assertFalse(e.isCollidingWith(o1));
		o2.move(new Point2D.Double(55, 55));
		Assert.assertTrue(e.isCollidingWith(o2));
	}

}
