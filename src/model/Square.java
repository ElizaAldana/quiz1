package model;

import processing.core.PApplet;

public class Square extends Figure {

	
	public Square(int tam, int posX, int posY, int dir, PApplet app) {
		super(tam,posX,posY,dir,app);
		
	}
	
	public void drawFigure() {
		app.rect(posX,posY,tam,tam);
		moveX();
	}
}
