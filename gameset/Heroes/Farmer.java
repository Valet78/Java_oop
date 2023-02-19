package gameset.Heroes;
/*
 * Крестьянин
 */
public class Farmer extends Human{  
    private int delivery = 1;  
    
    public Farmer(){         
        super.SetName("farmer_" +  Integer.valueOf(super.GetId()).toString()); 
    }  

    public Farmer(String inName){        
        super(inName);
        
    }    

    public int GetDelivery(){return this.delivery;}
    public void SetDelivery(int inDeliv){this.delivery = inDeliv;}

    
    public void GetInfo(){
        System.out.printf("Я Крестьянин (id=%d name=%s hp=%d(%d) damage=%d-%d dex=%d arm=%d attack=%d deliv=%d)\n", 
        super.GetId(), super.GetName(), super.GetHealthNom(), super.GetHealthMax(), super.GetDamageMin(), super.GetDamageMax(), 
        super.GetDexterity(), super.GetArmor(), super.GetAttack(), this.delivery);
    }

}
