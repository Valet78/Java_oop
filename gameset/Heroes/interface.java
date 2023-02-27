package gameset.Heroes;

import java.util.List;

interface  SetGamesDef{
    // Размер поля по умолчанию 20х20
    int MAX_X = 20;
    int MAX_Y = 20;

    void Step(Human agress, List<Human> ownTeam, List<Human> listTaget);
    String GetInfo();
    
}
 
