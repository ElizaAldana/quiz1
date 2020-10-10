package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic extends PApplet {

	private PApplet app;
	private String[] textfg;
	private ArrayList<Figure> figure;
	
	
	public Logic(PApplet app) {
		this.app=app;
		figure=new ArrayList<Figure>();
		
		//cargo texto
		textfg=app.loadStrings("txt/text.txt");
	}
	
	public void createFigure() {
		for (int i = 0; i < textfg.length; i++) {
			String[] cutText=textfg[i].split(" ");
			//para partir las palabras y valores
			int tam = Integer.parseInt(cutText[1]);
			int posX = Integer.parseInt(cutText[2]);
			int posY = Integer.parseInt(cutText[3]);
			int dir = Integer.parseInt(cutText[4]);

			if(cutText[0].equals("Square")) {
				figure.add(new Square(tam, posX,posY,dir,app));
				}
			if(cutText[0].equals("Circle")) {
				figure.add(new Circle(tam, posX,posY,dir,app));

			}
		}
	}
}
