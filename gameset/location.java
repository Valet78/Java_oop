package gameset;

import java.util.ArrayList;
import java.util.List;

import gameset.Heroes.Human;

public class location {
    private int x = 0, y = 0;
    static private double dist = 20, disttemp = 0;
    static List<Integer> locTaget = new ArrayList<>(2);    

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
        // List<Integer> tmp = Arrays.asList(this.x, this.y);
        return tmp;
    } 

    public void SetPozition(int inX, int inY){
        this.x = inX;
        this.y = inY;
    }

    // модуль поиска врага ближнего
    public List<Integer> SearchEnemy(Human agress, List<Human> listTaget){
        List<Integer> locAgress = agress.GetLocation();        
        List<Integer> tmp = new ArrayList<>(2); // 0 - индекс врага в списке, 1 - расстояние

        listTaget.forEach((n) -> {
            locTaget = n.GetLocation();
            disttemp = Math.sqrt((locAgress.get(0) - locTaget.get(0))^2 + (locAgress.get(1) - locTaget.get(1))^2);
            if(disttemp < dist){
                dist = disttemp;
                tmp.add(0, listTaget.indexOf(n));
                tmp.add(1, (int) dist);
            }
        });
        return tmp;
    }

}
