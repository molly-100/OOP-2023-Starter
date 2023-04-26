package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;

public class DANI extends PApplet {

	// Create Array list
	ArrayList<Follow> follow  = new ArrayList<Follow>();
	

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

		if(keyCode = )
		{
			writeSonnet();
		}

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
		loadFile();
		printModel();
        
	}

	public void loadFile()
	{
		String[] line;
		String[] w;
		int word_exists;
		int follow_exists;


		for(int i = 0; i < line.length; i++)
		{
			split(line[i], ' ');
			String s = w[i].replaceAll("[^\\w\\s]","");
			word_exists = findWord(s);
			follow_exists = findFollow(s);

			if(word_exists == 0 && follow_exists == 0)
			{
				s.toLowerCase();
				Follow Follow();
			}
			
		}
		
	}

	public int findFollow(String str)
	{
		int x = 0;

		for(int i = 0; i < follow.size(); i++)
		{
			if(str != Word follow.get(i))
			{
				x = 0;
			}
			else{
				x = 1;
			}

		}

		return x;
	}


	public int findWord(String str)
	{
		int x = 0;

		for(int i = 0; i < follow.size(); i++)
		{
			if(str != Word follow.get(i))
			{
				x = 0;
			}
			else{
				x = 1;
			}

		}

		return x;
	}

	public void printModel()
	{
		for(int i = 0; i < follow.size(); i++)
		{
			System.out.println(follow.get(i));
		}
	}

 

}
