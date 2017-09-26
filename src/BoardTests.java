import static org.junit.Assert.*;
import static java.lang.Math.*;
import java.util.Random;
import java.util.ArrayList;
import org.junit.Test;
import java.util.concurrent.*;

public class BoardTests {

	@Test
	public void SpawnRockTest() {
		Board board1 = new Board(1);
		board1.spawnRock();
		ArrayList<Rock> RocksTester = new ArrayList();
		assertEquals("Size of Rocks should be 1 greater than RocksTester",RocksTester.size()+1,board1.getRocks().size());
		assertEquals("Ycoord of rock in ArrayList should be zero",0,board1.getRocks().get(0).getY());
	}
	@Test
	public void setTimerTest() {
		Board sampleBoard = new Board(1);
		sampleBoard.setTimer(5);
		assertEquals("Time should read 5",5,sampleBoard.timer);
		sampleBoard.setTimer(10);
		assertEquals("Timer should read 10",10,sampleBoard.timer);
	}
	@Test
	public void moveRocksTest() {
		Board board2 = new Board(1);
		board2.spawnRock();
		board2.moveRocks();
		assertEquals("Ycoord of first rock should become 1 after one move",1,board2.getRocks().get(0).getY());
		board2.spawnRock();
		board2.moveRocks();
		assertEquals("Ycoord of first rock should become 2 after two moves",2,board2.getRocks().get(0).getY());
		assertEquals("Ycoord of second rock should become 1 after one moves",1,board2.getRocks().get(1).getY());
	}
	@Test
	public void removeRockTest() {
		Board b4 = new Board(1);
		b4.spawnRock();
		int size = b4.getRocks().size();
		b4.removeRock(0);
		assertNotEquals("Size before should not be size after removal",size,b4.getRocks().size());
		b4.spawnRock();
		b4.spawnRock();
		size = b4.getRocks().size();
		b4.removeRock(1);
		assertEquals("Size of rocks array should be one less after removal",size-1,b4.getRocks().size());
	}
	@Test
	public void moveLeftTest() {
		Board b5 = new Board(1);
		b5.moveLeft();
		assertEquals("Player should move to xcoord 9",9,b5.player.getX());
		b5.moveLeft();
		assertEquals("Player should move to xcoord 8",8,b5.player.getX());
	}
	@Test
	public void moveRightTest() {
		Board b6 = new Board(1);
		b6.moveRight();
		assertEquals("Player should move to xcoord 11",11,b6.player.getX());
		b6.moveRight();
		assertEquals("Player should move to xcoord 12",12,b6.player.getX());
	}
	@Test
	public void testProcessChar() {
		Board b3 = new Board(1);
		b3.processChar(111);
		assertEquals("o key should decrease xCoord",9,b3.player.getX());
		b3.processChar(112);
		assertEquals("The p char should increase xCoord",10,b3.player.getX());	
	}
	@Test
	public void takeTurnTest() {
		Board b7 = new Board(1);
		int difficulty = 49;
		b7.takeTurn(112);//p move right
		assertTrue("Should be 1-3 rocks added in Rocks arraylist",b7.getRocks().size()==1 || b7.getRocks().size()==2 || b7.getRocks().size()==3);
		assertTrue("Rocks in array should increase ycoord by 1",b7.getRocks().get(0).getY()==1);
		assertTrue("Player should increase xcoord by 1",11==b7.player.getX());
	}

}
