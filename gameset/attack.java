package gameset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.Random;

import gameset.Heroes.*;

public class Attack{    
    static private double dist = 20, disttemp = 0;
    static List<Integer> locTaget = new ArrayList<>(2); 
    Human tir;
    
    public Attack(){ }     
    
    // Вычисление урона противнику
    public int GoAttack(Human agress, Human taget, int distTaget){
        int uron = 0, maxD = 0, minD = 0, dist100 = 0, dist50 = 0;
        minD = agress.GetDamageMin();
        maxD = agress.GetDamageMax();
        dist100 = agress.GetAttack();
        dist50 =  dist100 + (int)(dist100 / 2);
        if(agress instanceof Sniper){
            if(distTaget <= dist100) uron = maxD;
            if(distTaget > dist100 || distTaget <= dist50) uron = minD + (int)((maxD - minD)/2);
            if(distTaget > dist50) uron = minD;
        }
        uron -= taget.GetArmor();
        return uron;
    }

        
    // модуль поиска врага ближнего
    public List<Integer> SearchEnemy(Human agress, List<Human> listTaget){
        List<Integer> locAgress = agress.GetLocation();         
        List<Integer> tmp = Arrays.asList(0, 0); // 0 - индекс врага в списке, 1 - расстояние
        listTaget.forEach((n) -> {
            locTaget = n.GetLocation();
            disttemp = Math.sqrt(Math.pow((locAgress.get(0) - locTaget.get(0)),2) + Math.pow((locAgress.get(1) - locTaget.get(1)), 2));
            // System.out.printf("agress [%d, %d], taget [%d, %d] name - %s, dist=%f\n", locAgress.get(0), locAgress.get(1), locTaget.get(0), locTaget.get(1), n.GetName(), disttemp);
            
            if(disttemp < dist){
                dist = disttemp;
                tmp.set(0, listTaget.indexOf(n));                
                tmp.set(1, (int) dist);
            }
        });
        return tmp;
    }

    // Поиск среди своих крестьянина
    public List<Integer> SearchFarmer(List<Human> listUnit){
        List<Integer> tmp = new ArrayList<>();

        listUnit.forEach((n) ->{
            if(n instanceof Farmer) tmp.add(listUnit.indexOf(n));
        });
        return tmp;
    }



    

}
