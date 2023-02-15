package gameset.Heroes;

public class Farmer extends Human{
    private int id = 0;
    private String strName = "";

    public Farmer(){        
        SetDefault();  
        this.strName = "farmer_" + Integer.valueOf(this.id).toString();    
        super.SetName(this.strName);        
    }
    
    public Farmer(String inName){
        SetDefault();
        super.SetName(inName);
    }

    private void SetDefault(){  
        temp++; 
        this.id = temp; 
        super.SetInd(this.id);     
        super.SetHealth(20);
        super.SetDamageMin(1);
        super.SetDamageMax(2);
        super.SetDexterity(0.02); 
        super.SetArmor(1);       
    }
}
