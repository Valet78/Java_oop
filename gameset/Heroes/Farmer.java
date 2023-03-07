package gameset.Heroes;

import java.util.List;

import gameset.Attack;

/*
 * Крестьянин
 */
public class Farmer extends Human{  
    private int delivery = 1, arrow = 0, tmpInd = 0;  
    static int xx = 0, yy = 0;
    private Shooter shooter = null;
    public Farmer(){  
        this("", 0, 0);        
        super.SetName("farmer_" +  Integer.valueOf(super.GetId()).toString()); 
    }  

    public Farmer(String inName, int X, int Y){
        super.SetName(inName);
        super.SetLocation(X, Y);
    }

    public int GetDelivery(){return this.delivery;}
    public void SetDelivery(int inDeliv){this.delivery = inDeliv;}

    
    // public void GetInfo(){
    //     System.out.printf("Я Крестьянин (id=%d name=%s hp=%d(%d) damage=%d-%d dex=%d arm=%d attack=%d deliv=%d)\n", 
    //     super.GetId(), super.GetName(), super.GetHealthNom(), super.GetHealthMax(), super.GetDamageMin(), super.GetDamageMax(), 
    //     super.GetDexterity(), super.GetArmor(), super.GetAttack(), this.delivery);
    // }

    @Override
    public void Step(Human agress, List<Human> ownTeam, List<Human> listTaget) {     
        Attack att = new Attack();
        arrow = 32;
        // Если обнаруживаем стрелков, то добавляем стрелу тому, у кого их мало или любому 
        List<Integer> indShooter = att.SearchShooters(ownTeam);
                
        if(indShooter.size() != 0) {           
            indShooter.forEach((n) -> {
                shooter = (Shooter)ownTeam.get(n.intValue());
                if(shooter.GetArrows() < arrow){
                   arrow = shooter.GetArrows();
                   
                   tmpInd = n.intValue();
                } 
            });

            try {
                shooter = (Shooter)ownTeam.get(tmpInd);
                shooter.SetArrows(shooter.GetArrows() + 1);
                // System.out.println("Добавлена стрела " + shooter.GetName());
            } catch (Exception e) {
                
            }
        }
        else {
            xx = GetLocation().get(0);
            yy = GetLocation().get(1);

            if(GetNameTeam() == "DarkUnit") {
                if(xx + 1 <= MAX_X){
                    SetLocation(xx + 1, yy);
                }
            }
            if(GetNameTeam() == "LigthUnit") {
                if(xx - 1 >= 0){
                    SetLocation(xx - 1, yy);
                }
            }
        }
               
    }

    // @Override
    // public String GetInfo() {
    //     return "Я крестьянин " + GetName() + ", " + GetLocation();
    // }



}
