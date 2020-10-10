package controller;

import java.util.ArrayList;

import model.Figure;
import model.Logic;
import processing.core.PApplet;

public class Control {

	private Logic logic;
	
	
	public Control (PApplet app) {
		logic=new Logic(app);
		
	}
	
	public ArrayList<Figure> getFigure() {
		return logic.getFigure();
	}
	
}
