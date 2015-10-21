package org.unioulu.tol.sqat2015.planetExplorer;

public class Obstacle {
	public int posX;
	public int posY;
	
	public Obstacle(int x, int y){
		this.posX = x;
		this.posY = y;
	}
	
    public boolean equals (Obstacle x) {
        if (x.posX == posX && x.posY == posY) return true;
        return false;
    }
}
