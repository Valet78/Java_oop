package gameset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import gameset.Heroes.Farmer;
import gameset.Heroes.Human;

public class Attack{
    private Random rnd = new Random();
    private int min = 0,  dext = 0, arm = 0, randMax = 0;
    private int hp = 0, max = 0, uron = 0, temp = 0;
    static private double dist = 20, disttemp = 0;
    static List<Integer> locTaget = new ArrayList<>(2); 
    Human tir;
    
    public Attack(){}     
    
    public Attack(Human agress, Human taget){
        this.min = agress.GetDamageMin();
        this.max = agress.GetDamageMax();
        this.dext = agress.GetDexterity(); 
        this.hp = taget.GetHealthNom(); 
        this.arm = taget.GetArmor();     
        tir = taget;
               
    }

    public void FizUron(){
        randMax = rnd.nextInt(max);
        // this.uron = (int) (rnd.nextInt(min, max)*1000)  + this.dext + this.ttMax;
        // this.uron = Math.abs(this.uron);
        this.uron = this.max;
        temp = this.hp - this.uron;
        System.out.println("uron=" + this.uron);
        if(temp > 0) tir.SetHealthNom(temp);
        else {
            tir.SetHealthNom(0);
            System.out.println("Герой пал смертью храбрых.");
        }                

    } 

    public int GetMin(){return this.min;}
    public int GetMax(){return this.max;}
    public int GetDext(){return this.dext;}
    public int GetArm(){return this.arm;}
    public int GetRand(){return this.randMax;}

    
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
