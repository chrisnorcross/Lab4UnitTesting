public class Player {

	private int Xcoord;
	private int Ycoord;
	private long time;
	private int score;
	private String model;
	//Commenting for GITHUB: Jama Yusuf, jyusuf, 9/26/17
	//I changed the model variable string from "X" to "C"
	
	public Player(int height, int width) {
		Xcoord = width/2;
		Ycoord = height;
		model = "C";
		this.time = System.currentTimeMillis();
		this.score  = 0;
	}


	public int getX() {
		return Xcoord;
	}


	public int getY() {
		return Ycoord;
	}


	public long getTime() {
		return System.currentTimeMillis() - time;
	}
	
	public int getScore(){
		return score;
	}

	public void setXcoord(int xcoord) {
		Xcoord = xcoord;
	}


	public void setYcoord(int ycoord) {
		Ycoord = ycoord;
	}

	
	public void moveLeft() {
		this.setXcoord(this.getX() -1);
		score++;
	}
	
	public void moveRight() {
		this.setXcoord(this.getX() +1);
		score++;
	}
	
	public String toString(){
		return model;
	}
	public void upScore(){
		score++;
	}
}
