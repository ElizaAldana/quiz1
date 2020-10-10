package controller;

import model.Logic;
import processing.core.PApplet;

public class Control {

	private Logic logic;
	
	
	public Control (PApplet app) {
		logic=new Logic(app);
		
	}
	
	public void createFigure() {
		logic.createFigure();
	}
	
}
