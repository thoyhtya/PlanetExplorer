package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:
public class PlanetExplorer {
	int gridSizeX;
	int gridSizeY;
	int positionX;
	int positionY;
	char facing;
	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		this.gridSizeX = x;
		this.gridSizeY = y;
		this.positionX = 0;
		this.positionY = 0;
		this.facing = 'N';
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		for(char oneCommand : command.toCharArray()){
			switch(oneCommand){
			case 'f' : this.moveForward();
				break;
			case 'b' : this.moveBackward();
				break;
			case 'l' : this.turnLeft();
				break;
			case 'r' : this.turnRight();
				break;	
			}
		}
		
		String strX = Integer.toString(this.positionX);
		String strY = Integer.toString(this.positionY);
		String strF = "" + this.facing;
		
		return "(" + strX + "," + strY + "," + strF + ")";
	}
	
	private void moveForward(){
		switch (this.facing){
			case 'N' : this.positionY += 1;
				break;
			case 'E' : this.positionX += 1;
				break;
			case 'S' : this.positionY -= 1;
				break;
			case 'W' : this.positionX -= 1;
				break;						
		}		
	}
	
	private void moveBackward(){
		switch (this.facing){
			case 'N' : this.positionY -= 1;
				break;
			case 'E' : this.positionX -= 1;
				break;
			case 'S' : this.positionY += 1;
				break;
			case 'W' : this.positionX += 1;
				break;						
		}		
	}
	
	private void turnLeft(){
		switch (this.facing){
			case 'N' : this.facing = 'W';
				break;
			case 'E' : this.facing = 'N';
				break;
			case 'S' : this.facing = 'E';
				break;
			case 'W' : this.facing = 'S';
				break;						
		}		
	}
	
	private void turnRight(){
		switch (this.facing){
			case 'N' : this.facing = 'E';
				break;
			case 'E' : this.facing = 'S';
				break;
			case 'S' : this.facing = 'W';
				break;
			case 'W' : this.facing = 'N';
				break;						
		}		
	}
}
