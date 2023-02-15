package gameset.Heroes;

public class Sniper extends Human{
    private int id = 0;
    private String strName = "";

    public Sniper(){        
        SetDefault();  
        this.strName = "farmer_" + Integer.valueOf(this.id).toString();    
        super.SetName(this.strName);        
    }
    
    public Sniper(String inName){
        SetDefault();
        super.SetName(inName);
    }

    private void SetDefault(){  
        temp++; 
        this.id = temp; 
        super.SetInd(this.id);     
        super.SetHealth(40);
        super.SetDamageMin(50);
        super.SetDamageMax(55);
        super.SetDexterity(0.6);   
        super.SetArmor(3);      
    }

}
