package testTriton;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import triton.Player;
import triton.Upgrade;

public class TestUpgrade {
	class mockUpgrade extends Upgrade{
		public mockUpgrade (int cost){
			super(cost, null, "");
		}
		public int getcost(){
			return cost;
		}
	
	}
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testcreate() {
		mockUpgrade U = new mockUpgrade(100);
		assertTrue(U.getcost() == 100);
	}
	
	@Test
	public void testpurchase(){
		Player P = new Player(150, null, null);
		mockUpgrade U = new mockUpgrade(100);
		assertTrue(U.canBuy(P));
	}

}
