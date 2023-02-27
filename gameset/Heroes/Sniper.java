package gameset.Heroes;

import java.util.List;

import gameset.Attack;

/*
 * Снайпер
 */
public class Sniper extends Human{  
    private int arrows;  

    public Sniper(){        
        this("", 0, 0);         
        super.SetName("sniper_" + Integer.valueOf(super.GetId()).toString());        
    }
    
    public Sniper(String inName, int X, int Y){        
        super.SetName(inName);
        super.SetHealthMax(15);
        super.SetHealthNom(15);
        super.SetDamageMin(8);
        super.SetDamageMax(10);        
        super.SetAttack(12);
        super.SetArmor(10);
        super.SetDexterity(9);
        this.arrows = 32;
        super.SetLocation(X, Y);
    }

    public int GetArrows(){return this.arrows;}
    public void SetArrows(int inArr){this.arrows = inArr;}

    // public void GetInfo(){        
    //     System.out.printf("Я Снайпер (id=%d name=%s hp=%d(%d) damage=%d-%d dex=%d arm=%d attack=%d arrows=%d)\n", 
    //     super.GetId(), super.GetName(), super.GetHealthNom(), super.GetHealthMax(), super.GetDamageMin(), super.GetDamageMax(), 
    //     super.GetDexterity(), super.GetArmor(), super.GetAttack(), this.arrows);
    // }

    @Override
    public void Step(Human agress, List<Human> ownTeam, List<Human> listTaget) {
        int uron = 0, ind = 0, tmph = 0;
        Human tagUnit = null;
        if(GetArrows() !=0 && GetHealthNom() !=0){
            Attack att = new Attack();
            // Поиск ближнего врага
            List<Integer> tag = att.SearchEnemy(agress, listTaget);
            tagUnit = listTaget.get(tag.get(0));
            ind = tag.get(1);
            uron = att.GoAttack(agress, tagUnit, ind);
            if(uron > 0) {
                tmph = tagUnit.GetHealthNom() - uron;
                tagUnit.SetHealthNom(tmph);
            } 

            // Поиск крестьянина в команде, при наличии добавляем стрелу 
            List<Integer> farmList = att.SearchFarmer(ownTeam);
            if(farmList.size() > 0) this.arrows++;
        }
        else {System.out.println("Он мёртв или у него нет стрел!");}
    }

    @Override
    public String GetInfo() {
        return "Я снайпер " + GetName() + ", " + GetLocation();
    }

}
