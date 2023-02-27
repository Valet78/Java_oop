package gameset.Heroes;
/*
 * Маг (Колдун)
 */

public class Magician extends Human {
    public int mannaMax, mannaNom;
    
    public Magician(){ 
        this("", 0, 0);              
        super.SetName("magician_" + Integer.valueOf(super.GetId()).toString()); 

    }
    public Magician(String inName, int X, int Y){         
        super.SetName(inName);
        super.SetHealthMax(30);
        super.SetHealthNom(30);
        super.SetDamageMin(2);
        super.SetDamageMax(5);        
        super.SetAttack(17);
        super.SetArmor(12);
        super.SetDexterity(9);
        this.mannaMax = 3;
        this.mannaNom = 3;
        super.SetLocation(X, Y);
        // this.mannaMax = mannT;
    }
   
    public int GetMannaMax(){return this.mannaMax;}
    public int GetMannaNom(){return this.mannaNom;}
    public void SetMannaMax(int inManna){this.mannaMax = inManna;}
    public void SetMannaNom(int inManna){this.mannaNom = inManna;}

    // public void GetInfo(){        
    //     System.out.printf("Я Колдун (id=%d name=%s hp=%d(%d) damage=%d-%d dex=%d arm=%d attack=%d manna=%d(%d))\n", 
    //     super.GetId(), super.GetName(), super.GetHealthNom(), super.GetHealthMax(), super.GetDamageMin(), super.GetDamageMax(), 
    //     super.GetDexterity(), super.GetArmor(), super.GetAttack(), this.mannaNom, this.mannaMax);
    // }

    // @Override
    // // public void Step() {
    // }

    @Override
    public String GetInfo() {        
        return "Я колдун " + GetName() + ", " + GetLocation();
    }

}
