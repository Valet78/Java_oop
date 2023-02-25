package gameset.Heroes;
/*
 * Арбалетчик
 */
public class Arbalester extends Human{
    private int arrows;

    public Arbalester(){        
        this("",0, 0);           
        super.SetName("arbalester_" + Integer.valueOf(super.GetId()).toString());        
    }
    
    public Arbalester(String inName, int X, int Y){
        super.SetName(inName);
        super.SetHealthMax(10);
        super.SetHealthNom(10);
        super.SetDamageMin(2);
        super.SetDamageMax(3);        
        super.SetAttack(6);
        super.SetArmor(3);
        super.SetDexterity(4);
        this.arrows = 16;
        super.SetLocation(X, Y);
    }

   
    public int GetArrows(){return this.arrows;}
    public void SetArrows(int inArr){this.arrows = inArr;}

    // public void GetInfo(){        
    //     System.out.printf("Я Арбалетчик (id=%d name=%s hp=%d(%d) damage=%d-%d dex=%d arm=%d attack=%d arrows=%d)\n", 
    //     super.GetId(), super.GetName(), super.GetHealthNom(), super.GetHealthMax(), super.GetDamageMin(), super.GetDamageMax(), 
    //     super.GetDexterity(), super.GetArmor(), super.GetAttack(), this.arrows);
    // }

    @Override
    public void Step() {        
    }

    @Override
    public String GetInfo() {
        return "Я арбалетчик " + GetName() + ", " + GetLocation();
    } 


}
