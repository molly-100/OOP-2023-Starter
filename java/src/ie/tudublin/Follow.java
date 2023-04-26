package ie.tudublin;

import processing.core.PApplet;

public class Follow {
    
    public String word;
    //public int couunt = 0;

    public void Follow(String word, Int count)
    {
        this.word = word;
        this.count = count;

    }

    public Follow(PApplet p)
    {
        this(p.getString("word"), p.getInt("count"));

    }


    public toString String()
    {
        "This string " + ""
    }
}
