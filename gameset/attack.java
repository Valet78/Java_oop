package gameset;

import java.util.Random;
import gameset.Heroes.Human;

public class attack {
    private Random rnd = new Random();
    private int min = 0, max = 0, dext = 0, uron = 0;
    private int hp = 0, arm = 0, ttMax = 0, temp = 0;
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
        ttMax = rnd.nextInt(max);
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
    

}
