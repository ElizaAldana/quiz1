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
}
