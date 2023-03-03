package gameset.Heroes;
/* 
* Монах 
*/
public class Monk extends Magi {
        
    public Monk(){    
        super();       
        super.SetName("magician_" + Integer.valueOf(super.GetId()).toString());        
    }
    public Monk(String inName, int X, int Y){  
        super(inName, X, Y);
        super.SetName(inName);
        super.SetHealthMax(30);
        super.SetHealthNom(30);
        super.SetDamageMin(2);
        super.SetDamageMax(4);        
        super.SetAttack(12);
        super.SetArmor(7);
        super.SetDexterity(5);
        super.SetMannaMax(1);
        super.SetMannaNom(1);
        super.SetLocation(X, Y);       
    }

    // public void GetInfo(){        
    //     System.out.printf("Я Монах (id=%d name=%s hp=%d(%d) damage=%d-%d dex=%d arm=%d attack=%d manna=%d(%d))\n", 
    //     super.GetId(), super.GetName(), super.GetHealthNom(), super.GetHealthMax(), super.GetDamageMin(), super.GetDamageMax(), 
    //     super.GetDexterity(), super.GetArmor(), super.GetAttack(), this.mannaNom, this.mannaMax);
    // }
    
}
