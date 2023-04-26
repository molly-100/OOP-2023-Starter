package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	// Create Array list
	ArrayList<Follow> stars = new ArrayList<Follow>();
	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);
		
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}

	public void loadFile()
	{
		loadStrings("small.txt");
		split(line, ' ');
		w.replaceAll("[^\\w\\s]","");
		s.toLowerCase()
	}

	public void findWord()
	{

	}

	public void displayModel()
	{

	}

	public void writeSonnet()
	{
		
	}
}
