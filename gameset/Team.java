package gameset;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import gameset.Heroes.Arbalester;
import gameset.Heroes.Bandit;
import gameset.Heroes.Farmer;
import gameset.Heroes.Human;
import gameset.Heroes.Lancer;
import gameset.Heroes.Magician;
import gameset.Heroes.Monk;
import gameset.Heroes.Sniper;

public class Team {
    private String nameTeam = "";
    static int indX = 0, indY = 0, idTeam = 1;
    
    public Team() {
        this.nameTeam = "NoName";
    }    

    public String GetName(){return this.nameTeam;}
    public void SetName(String nameTeam) {this.nameTeam = nameTeam;}

    // Генератор рандомного войска из имеющихся классов
    public List<Human> AddTeamRnd(int inNum, String inName){
        List<Human> tmp = new ArrayList<Human>();
        Random rd = new Random();
        this.nameTeam = inName;
        int rdn = 0;
        indX = 0;
        indY = 1;
        
        for(int i=0; i < inNum; i++){
            inName = this.nameTeam + "_" + Integer.toString(i + 1); 
            rdn = rd.nextInt(0, 6);
            tmp.add(SwitchHuman(rdn, inName));             
        } 

        // сортировка
        // tmp = SortListTeam(tmp);
        tmp.sort((w1, w2) -> Integer.compare(w1.GetDexterity(), w2.GetDexterity()));


        return tmp;
    }

    // Модуль создания группы персонажей заданного типа
    public List<Human> AddTeam(int inNum, String inName, int[] listType){
        List<Human> tmp = new ArrayList<Human>();
        int len = listType.length;
        Random rd = new Random();
        this.nameTeam = inName;
        int rdn = 0;
        if(idTeam == 1) {
            indX = 0;
            indY = 0;
        } else {
            indX = 100;
            indY = 0;
        }
        
        for(int i=0; i < inNum; i++){
            inName = this.nameTeam + "_" + Integer.toString(i + 1); 
            rdn = rd.nextInt(0, len);
            tmp.add(SwitchHuman(listType[rdn], inName));             
        } 

        // сортировка
        // tmp = SortListTeam(tmp);

        tmp.sort((w1, w2) -> Integer.compare(w1.GetDexterity(), w2.GetDexterity()));

        idTeam = 2;
        return tmp;
    }

    // Модуль выборки персонажей
    private Human SwitchHuman(int inNum, String nUn){
        Human tmpHuman = null; 
        int setX = 0;
        if(idTeam == 1) {
            setX = indX + 1;
            indY += 2;
        } else {
            setX = indX - 1;
            indY += 2;
        }
        switch (inNum) {
            case 0:                    
                tmpHuman = new Farmer(nUn, indX, indY);  // на задний план 
                break;
            case 1:                    
                tmpHuman = new Bandit(nUn, setX, indY);
                break;
            case 2:                    
                tmpHuman = new Lancer(nUn, setX, indY);
                break;
            case 3:                    
                tmpHuman = new Sniper(nUn, setX, indY);
                break;
            case 4:                    
                tmpHuman = new Arbalester(nUn, setX, indY);
                break;
            case 5:                    
                tmpHuman = new Magician(nUn, indX, indY);  // на задний план 
                break;    
            case 6:                    
                tmpHuman = new Monk(nUn, indX, indY);  // на задний план 
                break;            
        }
        tmpHuman.SetNameTeam(this.nameTeam);
        
        return tmpHuman;
    }

    // Модуль сортировки
    // private List<Human> SortListTeam(List<Human> inList){        
    //     List<Human> tmpList = new ArrayList<>();
    //     List<Integer> tmpDext = new ArrayList<>(); 
        
    //     inList.forEach((n) -> {
    //         if(!tmpDext.contains(n.GetDexterity())) 
    //             tmpDext.add(n.GetDexterity());
    //     });
    //     tmpDext.sort(Comparator.reverseOrder());        
    //     tmpDext.forEach((n) -> {
    //         inList.forEach((x) -> {
    //             if(x.GetDexterity() == n) tmpList.add(x);
    //         });            
    //     });        
    //     return tmpList;
    // }

}
