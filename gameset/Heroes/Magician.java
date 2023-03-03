package gameset.Heroes;
/*
 * Маг (Колдун)
 */

public class Magician extends Magi {
    // public int mannaMax, mannaNom;
    
    public Magician(){ 
        super();              
        super.SetName("magician_" + Integer.valueOf(super.GetId()).toString()); 

    }
    public Magician(String inName, int X, int Y){  
        super(inName, X, Y);     
        super.SetName(inName);
        super.SetHealthMax(30);
        super.SetHealthNom(30);
        super.SetDamageMin(2);
        super.SetDamageMax(5);        
        super.SetAttack(17);
        super.SetArmor(12);
        super.SetDexterity(9);
        super.SetMannaMax(3);
        super.SetMannaNom(3);
        super.SetLocation(X, Y);        
    }
   
    // public void GetInfo(){        
    //     System.out.printf("Я Колдун (id=%d name=%s hp=%d(%d) damage=%d-%d dex=%d arm=%d attack=%d manna=%d(%d))\n", 
    //     super.GetId(), super.GetName(), super.GetHealthNom(), super.GetHealthMax(), super.GetDamageMin(), super.GetDamageMax(), 
    //     super.GetDexterity(), super.GetArmor(), super.GetAttack(), this.mannaNom, this.mannaMax);
    // }

}
