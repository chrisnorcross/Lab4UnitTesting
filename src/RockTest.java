import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RockTest {

	@Test
	public void testToString() {
		Rock rock1 = new Rock(10,10);
		assertEquals("Rock Model is O", "O", rock1.toString());
		assertNotEquals("Rock Model is not X", "X", rock1.toString());
	}
	
	@Test
	public void testSetXCoord() {
		Rock rock3 = new Rock(10,10);
		rock3.setxCoord(5);
		assertEquals("rock3 is at x location 5",5,rock3.getX());
		rock3.setxCoord(10);
		assertEquals("rock3 is at x location 10",10,rock3.getX());
	}
	@Test
	public void testSetYCoord() {
		Rock rock2 = new Rock(5,10);
		rock2.moveRock();
		assertEquals("Rock y coord is 1",1, rock2.getY());
		rock2.moveRock();
		assertEquals("Rock y coord is 2", 2, rock2.getY());
	}
	@Test
	public void testgetX() {
		Rock rock3 = new Rock(10,10);
		assertTrue("rock3 x is between 0 and 10",0<= rock3.getX()&&rock3.getX() <10);
		Rock rock4 = new Rock(10,10);
		assertTrue("rock4 x is between 0 and 10",0<= rock4.getX()&&rock4.getX() <10);
	}
	@Test
	public void testgetY() {
		Rock rock5 = new Rock(10,10);
		assertEquals("Y coordinate should be zero",0,rock5.getY());
		rock5.setyCoord(5);
		assertEquals("Y coordinate should be 5",5,rock5.getY());
	}
	@Test
	public void testmoveRock() {
		Rock rock7 = new Rock(10,10);
		rock7.moveRock();
		assertEquals("rock7 y moves from 0 to 1",1,rock7.getY());
		rock7.moveRock();
		assertEquals("rock7 y moves from 1 to 2",2,rock7.getY());

	}
}

