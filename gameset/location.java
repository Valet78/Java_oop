package gameset;

import java.util.ArrayList;
import java.util.List;

public class location {
    private int x = 0, y = 0;

    public location(){
        this(0, 0);
    }

    public location(int inX, int inY){
        this.x = inX;
        this.y = inY;
    }

    public List<Integer> GetPozition(){
        List<Integer> tmp = new ArrayList<Integer>(){
                            {   add(x);
                                add(y);}
                            };
        return tmp;
    } 

    public void SetPozition(int inX, int inY){
        this.x = inX;
        this.y = inY;
    }



}
