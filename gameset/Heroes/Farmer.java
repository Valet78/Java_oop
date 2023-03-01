package gameset.Heroes;
/*
 * Крестьянин
 */
public class Farmer extends Human{  
    private int delivery = 1;  
    
    public Farmer(){  
        this("", 0, 0);        
        super.SetName("farmer_" +  Integer.valueOf(super.GetId()).toString()); 
    }  

    public Farmer(String inName, int X, int Y){
        super.SetName(inName);
        super.SetLocation(X, Y);
    }

    public int GetDelivery(){return this.delivery;}
    public void SetDelivery(int inDeliv){this.delivery = inDeliv;}

    
    // public void GetInfo(){
    //     System.out.printf("Я Крестьянин (id=%d name=%s hp=%d(%d) damage=%d-%d dex=%d arm=%d attack=%d deliv=%d)\n", 
    //     super.GetId(), super.GetName(), super.GetHealthNom(), super.GetHealthMax(), super.GetDamageMin(), super.GetDamageMax(), 
    //     super.GetDexterity(), super.GetArmor(), super.GetAttack(), this.delivery);
    // }

    // @Override
    // public void Step() {        
    // }

    // @Override
    // public String GetInfo() {
    //     return "Я крестьянин " + GetName() + ", " + GetLocation();
    // }



}
