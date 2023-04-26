package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;
import java.util.ArrayList;


public class Follow {
    
    private String word;
    private int count = 0;

    public void Follow(String word, Int count)
    {
        this.word = word;
        this.count = count;

    }

    public Follow(TableRow row)
    {
        this(p.getString("word"), p.getInt("count"));

    }

    public void setWord(String word)
    {
        this.word;
    }

    public void setWord(int count)
    {
        this.count;
    }

    public int getCount()
    {
        return count;
    }

    public String getWord()
    {
       return  word;
    }


    public toString String()
    {
        return obj["This string " + ""];
    }
}
