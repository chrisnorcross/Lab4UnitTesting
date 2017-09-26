import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

		// X Value in Player is DIVIDED by 2
		@Test
		public void testMoveLeft(){
			Player p1 = new Player(10,10);
			p1.moveLeft();
			assertEquals("Move 1 to the left of 5",4,p1.getX());
			p1.moveLeft();
			assertEquals("Move 1 to the left of 4",3,p1.getX());
			
	
		}		
		@Test
		public void testMoveRight(){
			Player p1 = new Player(10,10);
			p1.moveRight();
			assertEquals("Move 1 to the right of 5",6,p1.getX());
			p1.moveRight();
			assertEquals("Move 1 to the right of 6",7,p1.getX());
			
	
		}	
		@Test
		public void testToString(){
			Player p1 = new Player(10,10);
			p1.toString();
			assertEquals("Test to see if model is X (Player)","X",p1.toString());
			assertNotEquals("Test to see if model is the Rock ( O )","O",p1.toString());
			
	
		}
		@Test
		public void testUpScore(){
			Player p1 = new Player(10,10);
			p1.upScore();
			assertEquals("Score increases from 0 to 1",1,p1.getScore());
			p1.upScore();
			assertEquals("Score increases from 1 to 2",2,p1.getScore());
		}
		
		@Test
		public void GetXtest() {
			Player player1 = new Player(10,10);
			assertEquals("Player Xcoord should be half of 10", 5, player1.getX());;
			player1.setXcoord(6);
			assertEquals("Player Xcoord should be 6",6, player1.getX());
		}
		
		@Test
		public void GetYtest() {
			Player player2 = new Player(10,10);
			assertEquals("Player Ycoord should be 10",10,player2.getY());
			player2.setYcoord(5);
			assertEquals("Player Ycoord shoud be 5",5,player2.getY());
		}
		@Test
		public void getTimeTest() {
			Player player3 = new Player(10,10);
			long time = System.currentTimeMillis();
			assertEquals("Long time and player3's time should be equal",System.currentTimeMillis()-time, player3.getTime());
			assertNotEquals("Player's time is not equal to the current time", System.currentTimeMillis(),player3.getTime());
		}
		@Test
		public void getScoreTest() {
			Player player4 = new Player(10,10);
			assertEquals("Score should equal 0",0,player4.getScore());
			player4.upScore();
			assertEquals("Score should equal 1",1,player4.getScore());
		}
		@Test
		public void setXcoordTest() {
			Player player5 = new Player(10,10);
			player5.setXcoord(5);
			assertEquals("Xcoord should be equal to 5",5,player5.getX());
			player5.setXcoord(10);
			assertEquals("Xcoord should equal 10",10,player5.getX());
		}
		@Test
		public void setYcoordTest() {
			Player player6 = new Player(10,10);
			player6.setYcoord(5);
			assertEquals("Ycoord should be equal to 5",5,player6.getY());
			player6.setYcoord(10);
			assertEquals("Ycoord should be equalt to 10",10,player6.getY());
		}
}