package gameset.Heroes;

import java.text.DecimalFormat;

public class Monk extends Human{
    public int id = 0, manna = 0, magdam = 0;
    
    public Monk(){    
        SetDefault();       
        super.SetName("magician_" + Integer.valueOf(this.id).toString());        
    }
    public Monk(String inName){  
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
        super.SetDexterity(0.3);
        super.SetArmor(1);
        this.manna =  20;
        this.magdam = 5;       
    }     

    @Override
    public void GetInfo(){
        DecimalFormat txtDext = new DecimalFormat("#.##");
        System.out.printf("id=%d name=%s hp=%d dmin=%d dmax=%d dex=%s man=%d \n", this.id, GetName(), GetHealth(), GetDamageMin(), GetDamageMax(), txtDext.format(GetDexterity()), this.manna);
        
    }

}
