package gameset.Heroes;

import java.util.List;

import gameset.Attack;

public abstract class Shooter extends Human{
    private int arrows;

    public Shooter(){
        this("", 0, 0);
    }
     
    public Shooter(String inName, int X, int Y){ }   


    public int GetArrows(){return this.arrows;}
    public void SetArrows(int inArr){this.arrows = inArr;}



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
                if(tmph > 0) tagUnit.SetHealthNom(tmph);
                else tagUnit.SetHealthNom(0);
            } 

            // Поиск крестьянина в команде, при наличии добавляем стрелу 
            List<Integer> farmList = att.SearchFarmer(ownTeam);
            if(farmList.size() > 0) this.arrows++;
        }
        else {System.out.println("Он мёртв или у него нет стрел!");}
    }





}
