package gameset.Heroes;

import java.text.DecimalFormat;

public class Magician extends Human{
    public int id = 0, manna = 0, magdam = 0;
    
    public Magician(){    
        SetDefault();       
        super.SetName("magician_" + Integer.valueOf(this.id).toString());        
    }
    public Magician(String inName){  
        SetDefault();
        super.SetName(inName);        
    }

    private void SetDefault(){         
        temp++;  
        this.id = temp;
        super.SetInd(this.id);   
        super.SetHealth(40);
        super.SetDamageMin(50);
        super.SetDamageMax(65);
        super.SetDexterity(0.6);
        super.SetArmor(2);
        this.manna =  50;
        this.magdam = 15;       
    }     
    @Override
    public void GetInfo(){
        DecimalFormat txtDext = new DecimalFormat("#.##");
        System.out.printf("id=%d name=%s hp=%d dmin=%d dmax=%d dex=%s man=%d \n", this.id, GetName(), GetHealth(), GetDamageMin(), GetDamageMax(), txtDext.format(GetDexterity()), this.manna);
        
    }
}
