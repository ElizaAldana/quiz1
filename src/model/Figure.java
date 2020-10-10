package model;

import processing.core.PApplet;

public abstract class Figure {

	protected int tam, posX, posY, dir;
	protected PApplet app;
	
	Figure(int tam, int posX, int posY, int dir, PApplet app){
		this.app=app;
		this.tam=tam;
		this.posX=posX;
		this.posY=posY;
		this.dir=dir;
	}
	
	public abstract void drawFigure();
	
	public void moveX(){
		this.posY = (this.posY + 4)*dir;
		
	}
}
