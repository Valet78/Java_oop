package gameset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.Random;
import java.util.Random;

import gameset.Heroes.*;

public class Attack{    
    private double dist = 20, disttemp = 0;    
    static private List<Integer> locTaget = new ArrayList<>(2); 
       
    public Attack(){ }     
    
    // Вычисление урона противнику
    public int GoAttack(Human agress, Human taget, int distTaget){
        Random rnd = new Random();
        int uron = 0, maxD = 0, minD = 0, dist100 = 0, distMax = 0;
        minD = agress.GetDamageMin();
        maxD = agress.GetDamageMax();
        distMax = agress.GetAttack();
        dist100 = (int)(distMax/2) + 1;
        
        if(distTaget <= dist100) uron = maxD;
        if(distTaget > dist100 && distTaget <= distMax) uron = rnd.nextInt(minD, maxD);
        if(distTaget > distMax) uron = 0;
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
    // public List<Integer> SearchFarmer(List<Human> listUnit){
    //     List<Integer> tmp = new ArrayList<>();

    //     listUnit.forEach((n) ->{
    //         if(n instanceof Farmer) tmp.add(listUnit.indexOf(n));
    //     });
    //     return tmp;
    // }

    // Поиск среди своих стрелка
    public List<Integer> SearchShooters(List<Human> listUnit){
        List<Integer> indShooter = new ArrayList<>();                       

        listUnit.forEach((n) ->{
            if(n instanceof Sniper || n instanceof Arbalester) {            
                indShooter.add(listUnit.indexOf(n));                    
            }              
        });
        return indShooter;
    }
    

    // Выявление погибших
    public void DelCorpse(List<Human> inList){
        List<Integer> tmp = new ArrayList<>();

        inList.forEach((x) -> {
            if(x.GetHealthNom() == 0) tmp.add(inList.indexOf(x));
        });
        // System.out.println(tmp);
        if(tmp.size() > 0) tmp.forEach((k) -> {inList.remove(k.intValue());});
    }


    

}
