package gameset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import gameset.Heroes.Farmer;
import gameset.Heroes.Human;

public class Location {
    private int x = 0, y = 0;
       

    public Location(){
        this(0, 0);
    }

    public Location(int inX, int inY){
        this.x = inX;
        this.y = inY;
    }

    public List<Integer> GetPozition(){
        // List<Integer> tmp = new ArrayList<Integer>(){
        //                     {   add(x);
        //                         add(y);}
        //                     };
        List<Integer> tmp = Arrays.asList(this.x, this.y);
        return tmp;
    } 

    public void SetPozition(int inX, int inY){
        this.x = inX;
        this.y = inY;
    }

}
