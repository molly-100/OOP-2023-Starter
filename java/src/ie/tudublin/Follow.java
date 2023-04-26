package ie.tudublin;

import processing.core.PApplet;
import java.util.ArrayList;


public class Follow 
{
    
    public String word;
    public int count = 0;

    public Follow(String word, int count)
    {
        this.word = word;
        this.count = count;
    }


    public void setWord(String word)
    {
        this.word = word;
    }

    public void setWord(int count)
    {
        this.count = count;
    }

    public int getCount()
    {
        return count;
    }

    public String getWord()
    {
       return  word;
    }

    
    public String toString()
    {
        return "Following word = " + word + "(" + count + ")";
    }
}
