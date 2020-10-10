package view;

import controller.Control;
import processing.core.PApplet;

public class Main extends PApplet {
	
	private Control control;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");
	}

	public void settings() {
		size(500,500);
	}
	public void setup() {
		control=new Control(this);
	}
	public void draw() {
		background(0);
		control.createFigure();
	}
}
