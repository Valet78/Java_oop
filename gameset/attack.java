package gameset;

import java.util.Random;
import gameset.Heroes.Human;

public class attack {
    private Random rnd = new Random();
    private int min = 0, max = 0, dext = 0, uron = 0;
    private int hp = 0, arm = 0;
    Human tir;
    
       
    // int min = 0, max = 0;
    
    public attack(Human agress, Human taget){
        this.min = agress.GetDamageMin();
        this.max = agress.GetDamageMax();
        this.dext = (int)(agress.GetDexterity() * max); 
        this.hp = taget.GetHealth(); 
        this.arm = taget.GetArmor();     
        tir = taget;
               
    }

    public void FizUron(){
        this.uron = (int) (rnd.nextInt(min, max)  + this.dext) / rnd.nextInt(max) - this.arm;
        int temp = this.hp - this.uron;
        if(temp > 0) tir.SetHealth(temp);
        else tir.SetHealth(0);        
        
        System.out.println("uron=" + uron);


    }
    public void MagicUron(){



    }

}
