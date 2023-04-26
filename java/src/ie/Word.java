package ie;

import java.util.ArrayList;

public class Word {

    public String word;
    public int count = 0;

    ArrayList[] follArrayList;

    public void Word(String word, ArrayList follow_ArrayList)
    {
        this.word = word;
        this.follow_ArrayList = follow_ArrayList;
    }

    public void sort()
    {

    }

    public String toString()
    {
        return follow_ArrayList["This string "];
    }
    
}
