package gameset.Heroes;

public class Lancer extends Human{
    private int id = 0;
    private String strName = "";

    public Lancer(){        
        SetDefault();  
        this.strName = "lancer_" + Integer.valueOf(this.id).toString();    
        super.SetName(this.strName);        
    }
    
    public Lancer(String inName){
        SetDefault();
        super.SetName(inName);
    }

    private void SetDefault(){  
        temp++; 
        this.id = temp; 
        super.SetInd(this.id);     
        super.SetHealth(40);
        super.SetDamageMin(40);
        super.SetDamageMax(45);
        super.SetDexterity(0.1); 
        super.SetArmor(6);        
    }

}
