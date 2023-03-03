package gameset.Heroes;

/*
 * Арбалетчик
 */
public class Arbalester extends Shooter{
    // private int arrows;

    public Arbalester(){        
        super();           
        super.SetName("arbalester_" + Integer.valueOf(super.GetId()).toString());        
    }
    
    public Arbalester(String inName, int X, int Y){
        super(inName, X, Y);
        super.SetName(inName);
        super.SetHealthMax(10);
        super.SetHealthNom(10);
        super.SetDamageMin(2);
        super.SetDamageMax(3);        
        super.SetAttack(6);
        super.SetArmor(3);
        super.SetDexterity(4);
        super.SetArrows(16);
        super.SetLocation(X, Y);
    }
    
    // public void GetInfo(){        
    //     System.out.printf("Я Арбалетчик (id=%d name=%s hp=%d(%d) damage=%d-%d dex=%d arm=%d attack=%d arrows=%d)\n", 
    //     super.GetId(), super.GetName(), super.GetHealthNom(), super.GetHealthMax(), super.GetDamageMin(), super.GetDamageMax(), 
    //     super.GetDexterity(), super.GetArmor(), super.GetAttack(), this.arrows);
    // }

}
