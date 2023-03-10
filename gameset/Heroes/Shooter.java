package gameset.Heroes;

import java.util.List;

import gameset.Attack;

public abstract class Shooter extends Human{
    private int arrows;

    public Shooter(){
        this("", 0, 0);
    }
     
    public Shooter(String inName, int X, int Y){super(inName, X, Y); }   


    public int GetArrows(){return this.arrows;}
    public void SetArrows(int inArr){this.arrows = inArr;}



    @Override
    public void Step(Human agress, List<Human> ownTeam, List<Human> listTaget) {
        int uron = 0, dist = 0, tmph = 0, xx = 0, yy = 0;
        Human tagUnit = null;
        Attack att = new Attack();

        if(GetArrows() !=0){
            
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

            // // Поиск крестьянина в команде, при наличии добавляем стрелу 
            // List<Integer> farmList = att.SearchFarmer(ownTeam);
            // if(farmList.size() > 0) this.arrows++;
            // P.S. Крестьяне сами разбираются, кому давать стрелу
                
    }





}
