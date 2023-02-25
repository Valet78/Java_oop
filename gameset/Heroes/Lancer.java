package gameset.Heroes;
/*
 * Копейщик
 */
public class Lancer extends Human{    
    
    public Lancer(String inName, int X, int Y){        
        super.SetName(inName);
        super.SetDamageMin(1);
        super.SetDamageMax(3);        
        super.SetAttack(4);
        super.SetArmor(5);
        super.SetDexterity(4);
        super.SetLocation(X, Y);
    }
    
    public Lancer(){        
        this("", 0, 0);             
        super.SetName("lancer_" + Integer.valueOf(super.GetId()).toString());        
    }
    
    // public void GetInfo(){        
    //     System.out.printf("Я Копейщик (id=%d name=%s hp=%d(%d) damage=%d-%d dex=%d arm=%d attack=%d)\n", 
    //     super.GetId(), super.GetName(), super.GetHealthNom(), super.GetHealthMax(), super.GetDamageMin(), super.GetDamageMax(), 
    //     super.GetDexterity(), super.GetArmor(), super.GetAttack());
    // }


    @Override
    public void Step() {
    }


    @Override
    public String GetInfo() {
        return "Я копейщик " + GetName()+ ", " + GetLocation();
    }

    

}
