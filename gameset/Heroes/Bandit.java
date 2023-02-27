package gameset.Heroes;
/*
 * Бандит
 */
public class Bandit extends Human{       
    
    public Bandit(String inName, int X, int Y){        
        super.SetName(inName);
        super.SetDamageMin(2);
        super.SetDamageMax(4);        
        super.SetAttack(8);
        super.SetArmor(3);
        super.SetDexterity(6);
        super.SetLocation(X, Y);
    }

    public Bandit(){          
        this("", 0, 0); 
        super.SetName("bandit_" + Integer.valueOf(super.GetId()).toString());       
    }
    
    // public void GetInfo(){        
    //     System.out.printf("Я Бандит (id=%d name=%s hp=%d(%d) damage=%d-%d dex=%d arm=%d attack=%d)\n", 
    //     super.GetId(), super.GetName(), super.GetHealthNom(), super.GetHealthMax(), super.GetDamageMin(), super.GetDamageMax(), 
    //     super.GetDexterity(), super.GetArmor(), super.GetAttack());
    // }

    // @Override
    // public void Step() {
    // }

    @Override
    public String GetInfo() {
        return "Я бандит " + GetName() + ", " + GetLocation();
    }
}
