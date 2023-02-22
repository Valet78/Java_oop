package gameset;

import java.util.ArrayList;
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
    
    // public Team(String name){
    //     this.nameTeam = name;
    // }
    
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

        for(int i=0; i < inNum; i++){
            inName = this.nameTeam + "_" + Integer.toString(i + 1); 
            rdn = rd.nextInt(0, 6);
            tmp.add(SwitchHuman(rdn, inName));             
        } 
        return tmp;
    }

    // Модуль создания группы персонажей заданного типа
    public List<Human> AddTeam(int inNum, String inName, int[] listType){
        List<Human> tmp = new ArrayList<Human>();
        int len = listType.length;
        Random rd = new Random();
        this.nameTeam = inName;
        int rdn = 0;
        
        for(int i=0; i < inNum; i++){
            inName = this.nameTeam + "_" + Integer.toString(i + 1); 
            rdn = rd.nextInt(0, len);
            tmp.add(SwitchHuman(listType[rdn], inName));             
        } 

        return tmp;
    }

    // Модуль выборки персонажей
    private Human SwitchHuman(int inNum, String nUn){
        Human tmpHuman; 

        switch (inNum) {
            case 0:                    
                tmpHuman = new Farmer(nUn);
                break;
            case 1:                    
                tmpHuman = new Bandit(nUn);
                break;
            case 2:                    
                tmpHuman = new Lancer(nUn);
                break;
            case 3:                    
                tmpHuman = new Sniper(nUn);
                break;
            case 4:                    
                tmpHuman = new Arbalester(nUn);
                break;
            case 5:                    
                tmpHuman = new Magician(nUn);
                break;    
            case 6:                    
                tmpHuman = new Monk(nUn);
                break;
            default:
                tmpHuman = new Human() {};
                break;
        }
        return tmpHuman;
    }
}
