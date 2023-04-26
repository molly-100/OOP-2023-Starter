package ie;

import java.util.ArrayList;
import ie.tudublin.Follow;

public class Word {

    public String word;
    public int count = 0;

    ArrayList<follow_ArrayList> follows;

    public void Word(String word, Follow follow_ArrayList)
    {
        this.word = word;
        this.follow_ArrayList = new follow_ArrayList<Follow>();
    }

    
    public String getMainWord(Table row)
    {
        return word;
    }

    public ArrayList getListFollows()
    {
        return follow_ArrayList;
    }

    public String toString()
    {
        for(int i = 0; i < follow_ArrayList.length; i++)
        {
            return word + ": " +  follow_ArrayList.get(i) + " (" + count + ")";
        }
       
    }
    
}
