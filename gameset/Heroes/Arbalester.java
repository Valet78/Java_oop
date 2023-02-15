package gameset.Heroes;

public class Arbalester extends Human{
    private int id = 0;
    private String strName = "";

    public Arbalester(){        
        SetDefault();  
        this.strName = "arbalester_" + Integer.valueOf(this.id).toString();    
        super.SetName(this.strName);        
    }
    
    public Arbalester(String inName){
        SetDefault();
        super.SetName(inName);
    }

    private void SetDefault(){  
        temp++; 
        this.id = temp; 
        super.SetInd(this.id);     
        super.SetHealth(40);
        super.SetDamageMin(25);
        super.SetDamageMax(30);
        super.SetDexterity(0.4);  
        super.SetArmor(6);      
    }

}
