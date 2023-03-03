package gameset.Heroes;

import java.util.List;

import gameset.Attack;

/*
 * Бандит
 */
public class Bandit extends Human{       
    
    public Bandit(String inName, int X, int Y){        
        super.SetName(inName);
        super.SetDamageMin(2);
        super.SetDamageMax(4);        
        super.SetAttack(8);
        super.SetArmor(3);
        super.SetDexterity(6);
        super.SetLocation(X, Y);
    }

    public Bandit(){          
        this("", 0, 0); 
        super.SetName("bandit_" + Integer.valueOf(super.GetId()).toString());       
    }
    
    // public void GetInfo(){        
    //     System.out.printf("Я Бандит (id=%d name=%s hp=%d(%d) damage=%d-%d dex=%d arm=%d attack=%d)\n", 
    //     super.GetId(), super.GetName(), super.GetHealthNom(), super.GetHealthMax(), super.GetDamageMin(), super.GetDamageMax(), 
    //     super.GetDexterity(), super.GetArmor(), super.GetAttack());
    // }

    @Override
    public void Step(Human agress, List<Human> ownTeam, List<Human> listTaget) {
        int uron = 0, dist = 0, tmph = 0, xx = 0, yy = 0;
        Human tagUnit = null;
        Attack att = new Attack();

        // Поиск ближнего врага
        List<Integer> tag = att.SearchEnemy(agress, listTaget);
        tagUnit = listTaget.get(tag.get(0));
        dist = tag.get(1);
        if (dist <= GetAttack()) {
            uron = att.GoAttack(agress, tagUnit, dist);
            if(uron > 0) {
                tmph = tagUnit.GetHealthNom() - uron;
                if(tmph > 0) tagUnit.SetHealthNom(tmph);
                else tagUnit.SetHealthNom(0);
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
    
}
