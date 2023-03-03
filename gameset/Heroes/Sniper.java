package gameset.Heroes;


/*
 * Снайпер
 */
public class Sniper extends Shooter{  
    // private int arrows;  

    public Sniper(){        
        super();         
        super.SetName("sniper_" + Integer.valueOf(super.GetId()).toString());        
    }
    
    public Sniper(String inName, int X, int Y){      
        super(inName, X, Y);
        super.SetName(inName);
        super.SetHealthMax(15);
        super.SetHealthNom(15);
        super.SetDamageMin(8);
        super.SetDamageMax(10);        
        super.SetAttack(12);
        super.SetArmor(10);
        super.SetDexterity(9);
        super.SetArrows(32);
        super.SetLocation(X, Y);
    }

    // public void GetInfo(){        
    //     System.out.printf("Я Снайпер (id=%d name=%s hp=%d(%d) damage=%d-%d dex=%d arm=%d attack=%d arrows=%d)\n", 
    //     super.GetId(), super.GetName(), super.GetHealthNom(), super.GetHealthMax(), super.GetDamageMin(), super.GetDamageMax(), 
    //     super.GetDexterity(), super.GetArmor(), super.GetAttack(), this.arrows);
    // }

}
