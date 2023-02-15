package gameset.Heroes;

import java.text.DecimalFormat;

/**
 * Абстрактный общий класс
 */
public abstract class Human {
    private int health = 0, damage_min = 0, damage_max = 0, id = 0, armor = 0;
    protected static int temp = 0;    
    private double dexterity = 0.01;
    private String name = "";  
      

    public Human(){        
    }
    
    public int GetInd(){return this.id;}
    public String GetName(){return this.name;}
    public int GetHealth(){return health;}
    public int GetDamageMin(){return damage_min;}
    public int GetDamageMax(){return damage_max;}
    public double GetDexterity(){return dexterity;}
    public int GetArmor(){return this.armor;}
    
    public void SetInd(int inId){this.id = inId;}
    public void SetName(String inName){this.name = inName;}
    public void SetHealth(int inHealth){this.health = inHealth;}
    public void SetDamageMin(int inDamage_min){this.damage_min = inDamage_min;}
    public void SetDamageMax(int inDamage_max){this.damage_max = inDamage_max;}
    public void SetDexterity(double inDexterity){        
        if (inDexterity > 0 &&  inDexterity < 1) this.dexterity = inDexterity;
    }    
    public void SetArmor(int inArm){this.armor = inArm;}
    
    


    public void GetInfo(){
        DecimalFormat txtDext = new DecimalFormat("#.##");
        System.out.printf("id=%d name=%s hp=%d dmin=%d dmax=%d dex=%s \n", id, name, health, damage_min, damage_max, txtDext.format(dexterity));
    }

}
