package gameset.Heroes;

import java.util.List;

import gameset.Attack;

public abstract class Magi extends Human{
    private int mannaMax, mannaNom;

    public Magi(){
        this("", 0, 0);
    }
     
    public Magi(String inName, int X, int Y){super(inName, X, Y); }   

    public int GetMannaMax(){return this.mannaMax;}
    public int GetMannaNom(){return this.mannaNom;}
    public void SetMannaMax(int inManna){this.mannaMax = inManna;}
    public void SetMannaNom(int inManna){this.mannaNom = inManna;}

/* 
 * НЕ УСПЕВАЮ ДОДЕЛАТЬ !!!!!!!!!
 */

    @Override                               
    public void Step(Human agress, List<Human> ownTeam, List<Human> listTaget) {
        int uron = 0, dist = 0, tmph = 0, xx = 0, yy = 0;
        Human tagUnit = null;
        Attack att = new Attack();

        if(GetMannaNom() != 0){
            
            // Если есть манна и найден свой с уменьшенным HP - лечим
            
        }  

        // Если лечить никого не нужно и в радиусе действия есть враг - наносим урон, иначе делаем ход вперед
            
  /*           // Поиск ближнего врага
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
          */
                
    }
}
