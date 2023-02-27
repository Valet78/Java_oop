package gameset;

import java.util.Arrays;
import java.util.List;

public class Locations {
    private int x = 0, y = 0;
       

    public Locations(){
        this(0, 0);
    }

    public Locations(int inX, int inY){
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
