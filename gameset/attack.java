package gameset;

import java.util.Random;
import gameset.Heroes.Human;

public class attack{
    private Random rnd = new Random();
    private int min = 0,  dext = 0, arm = 0, randMax = 0;
    private int hp = 0, max = 0, uron = 0, temp = 0;
    Human tir;
    
    public attack(){}     
    
    public attack(Human agress, Human taget){
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


    

}
