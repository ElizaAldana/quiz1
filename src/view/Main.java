package view;

import java.util.ArrayList;

import controller.Control;
import processing.core.PApplet;
import model.Figure;

public class Main extends PApplet {
	
	private Control control;
	private ArrayList<Figure>figure;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");
	}

	public void settings() {
		size(500,500);
	}
	public void setup() {
		control=new Control(this);
		figure=control.getFigure();
	}
	public void draw() {
		background(0);
		for (int i = 0; i < figure.size(); i++) {
			figure.get(i).drawFigure();
		}
	}
}
