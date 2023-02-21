package gameset.Heroes;
/* 
* Монах 
*/
public class Monk extends Human{
    public int mannaMax, mannaNom;
    
    public Monk(){    
        this("");       
        super.SetName("magician_" + Integer.valueOf(super.GetId()).toString());        
    }
    public Monk(String inName){  
        super.SetName(inName);
        super.SetHealthMax(30);
        super.SetHealthNom(30);
        super.SetDamageMin(2);
        super.SetDamageMax(4);        
        super.SetAttack(12);
        super.SetArmor(7);
        super.SetDexterity(5);
        this.mannaMax = 1;
        this.mannaNom = 1;       
    }

    public int GetMannaMax(){return this.mannaMax;}
    public int GetMannaNom(){return this.mannaNom;}
    public void SetMannaMax(int inManna){this.mannaMax = inManna;}
    public void SetMannaNom(int inManna){this.mannaNom = inManna;}

    // public void GetInfo(){        
    //     System.out.printf("Я Монах (id=%d name=%s hp=%d(%d) damage=%d-%d dex=%d arm=%d attack=%d manna=%d(%d))\n", 
    //     super.GetId(), super.GetName(), super.GetHealthNom(), super.GetHealthMax(), super.GetDamageMin(), super.GetDamageMax(), 
    //     super.GetDexterity(), super.GetArmor(), super.GetAttack(), this.mannaNom, this.mannaMax);
    // }

    @Override
    public void step() {
    }
    @Override
    public String GetInfo() {
        return "Я  монах " + GetName() + ".";
    }

}
