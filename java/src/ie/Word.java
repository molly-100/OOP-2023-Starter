package ie;

import java.util.ArrayList;
import ie.tudublin.Follow;

public class Word {

    public String word;
    public int count = 0;

    ArrayList[] follow_ArrayList;

    public void Word(String word, Follow follow_ArrayList)
    {
        this.word = word;
        this.follow_ArrayList = follow_ArrayList;
    }

    public void loadFile()
    {
        ArrayList[] arr = loadFile("small.txt");

      

    }

    public void sort()
    {

    }

    public String toString()
    {
        return "Word = " + word +  " count = " + count;
    }
    
}
