package gameset.Heroes;

/**
 * Абстрактный общий класс
 */
public abstract class Human implements SetGamesDef {
    protected static int numEkz; 
    private int id, healthMax, healthNom, damageMin, damageMax,  armor, attack, dexterity;       
    private String name = "";  
    
    static{numEkz = 0;}

    public Human(String name){    
        this.name = name;
        numEkz++; 
        this.id = numEkz;             
        this.healthMax = 10;
        this.healthNom = 10;
        this.damageMin = 0;
        this.damageMax = 1;
        this.armor = 1;
        this.attack= 1;
        this.dexterity = 3;
    }

    public Human(){
        this("");
    }
    
    public int GetId(){return this.id;}
    public String GetName(){return this.name;}
    public int GetHealthMax(){return this.healthMax;}
    public int GetHealthNom(){return this.healthNom;}
    public int GetDamageMin(){return this.damageMin;}
    public int GetDamageMax(){return this.damageMax;}
    public int GetArmor(){return this.armor;}
    public int GetAttack(){return this.attack;}
    public int GetDexterity(){return this.dexterity;}    
    
    public void SetInd(int inId){this.id = inId;}
    public void SetName(String inName){this.name = inName;}
    public void SetHealthMax(int inHealth){this.healthMax = inHealth;}
    public void SetHealthNom(int inHealth){this.healthNom = inHealth;}
    public void SetDamageMin(int inDamage_min){this.damageMin = inDamage_min;}
    public void SetDamageMax(int inDamage_max){this.damageMax = inDamage_max;}
    public void SetArmor(int inArm){this.armor = inArm;}
    public void SetAttack(int inAttac){this.attack = inAttac;}    
    public void SetDexterity(int inDexterity){this.dexterity = inDexterity; }       


    // public void GetInfo(){        
    //     System.out.printf("id=%d name=%s hp=%d(%d) damage=%d-%d dex=%d arm=%d attack=%d\n", 
    //     this.id, this.name, this.healthNom, this.healthMax, this.damageMin, this.damageMax, 
    //     this.dexterity, this.armor, this.attack);
    // }
    
    // public String GetInfo(){
    //     return "";
    // }

}
