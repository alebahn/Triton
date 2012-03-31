package testTriton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import triton.Bullet;
import triton.Player;

public class TestBullet {
	class MockBullet extends Bullet {
		public MockBullet(int penetration) {
			super(null, 0, penetration, 0, null, null);
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
		b.colide(new Player(0, null, null));
		Assert.assertFalse(b.isActive());
		b = new MockBullet(4);
		b.fire();
		b.colide(new Player(0, null, null));
		Assert.assertTrue(b.isActive());
		Assert.assertEquals(3, b.getPenetration());
	}
	
	@Test
	public void testColisionReact() {
		MockBullet b = new MockBullet(1);
		b.fire();
		b.colisionReact(new Player(0, null, null));
		Assert.assertTrue(b.isActive());
		Assert.assertEquals(1, b.getPenetration());
	}
	
	@Test
	public void testGetters() {
		MockBullet b = new MockBullet(1);
		Assert.assertNull(b.getDirection());
		Assert.assertEquals(0, b.getSpeed(), 0);
		Assert.assertEquals(1, b.getPenetration());
		Assert.assertEquals(0, b.getDamage());
		Assert.assertFalse(b.isActive());
	}

}
