package testTriton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import triton.Bullet;
import triton.Player;

public class TestBullet {
	class MockBullet extends Bullet {
		public MockBullet(int penetration) {
			super(null, 0, penetration, 0);
		}

		@Override
		public void tick() {
		}
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFire() {
		MockBullet b = new MockBullet(0);
		Assert.assertFalse(b.isActive());
		b.fire();
		Assert.assertTrue(b.isActive());
	}

	@Test
	public void testColide() {
		MockBullet b = new MockBullet(1);
		b.fire();
		b.colide(new Player());
		Assert.assertFalse(b.isActive());
		b = new MockBullet(4);
		b.fire();
		b.colide(new Player());
		Assert.assertTrue(b.isActive());
		Assert.assertEquals(3, b.getPenetration());
	}

}
