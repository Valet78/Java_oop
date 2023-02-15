package gameset.Heroes;

public class Bandit extends Human{    
    public int id = 0;
    
    public Bandit(){    
        SetDefault();       
        super.SetName("bandit_" + Integer.valueOf(this.id).toString());        
    }
    public Bandit(String inName){  
        SetDefault();
        super.SetName(inName);        
    }

    private void SetDefault(){         
        temp++;  
        this.id = temp;
        super.SetInd(this.id);   
        super.SetHealth(40);
        super.SetDamageMin(10);
        super.SetDamageMax(15);
        super.SetDexterity(0.04);
        super.SetArmor(4);        
    }     

}
