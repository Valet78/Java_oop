/*
 * Стартовый модуль
 */

package gameset;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import gameset.Heroes.Human;
import gameset.Heroes.Arbalester;
import gameset.Heroes.Bandit;
import gameset.Heroes.Farmer;
import gameset.Heroes.Lancer;
import gameset.Heroes.Magician;
import gameset.Heroes.Monk;
import gameset.Heroes.Sniper;

public class games {
    public static void main(String[] args) {
        console conOut = new console();

        Farmer vasya = new Farmer("Vasya");
        // Farmer unit1 = new Farmer();        
        Bandit jack = new Bandit("Jack");
        // Bandit unit2 = new Bandit();
        // Lancer nik = new Lancer("Nikolas");
        // Lancer unit3 = new Lancer();        
        // Sniper den = new Sniper("Demino");
        // Sniper unit4 = new Sniper();
        // Arbalester sem = new Arbalester("Semuel");
        // Arbalester unit5 = new Arbalester();        
        Magician dobr = new Magician("Dobrius");
        // Magician unit6 = new Magician();
        // Monk sand = new Monk("Sandos");
        // Monk unit7 = new Monk();
        
                        
        // vasya.GetInfo();
        // unit1.GetInfo();
        // System.out.println("--------------"); 
        conOut.OutString(jack.GetInfo());
        // unit2.GetInfo();
        System.out.println("--------------");
        // nik.GetInfo();
        // unit3.GetInfo();
        // System.out.println("--------------");
        // den.GetInfo();
        // unit4.GetInfo();
        // System.out.println("--------------");
        // sem.GetInfo();
        // unit5.GetInfo();
        // System.out.println("--------------");
        // dobr.GetInfo();
        // unit6.GetInfo();
        // System.out.println("--------------");
        // sand.GetInfo();
        // unit7.GetInfo();
        // System.out.println("--------------");


        conOut.OutString(dobr.GetInfo());
        System.out.println("--------------");        
        attack df = new attack(vasya, dobr);
        df.FizUron();
        System.out.println("--------------");  
        conOut.OutString(dobr.GetInfo());
        System.out.println("--------------"); 
        // dobr.ddf(dobr.getClass().getName());


        // Составить список персонажей
        List<Human> heroesList = new ArrayList<Human>();
        Random rd = new Random();
        String nameUn = "";

        for(int i=0; i < 10; i++){
            nameUn = "Human_" + Integer.toString(i);            
            switch (rd.nextInt(0, 6)) {
                case 0:                    
                    heroesList.add(new Farmer(nameUn));
                    break;
                case 1:                    
                    heroesList.add(new Bandit(nameUn));
                    break;
                case 2:                    
                    heroesList.add(new Lancer(nameUn));
                    break;
                case 3:                    
                    heroesList.add(new Sniper(nameUn));
                    break;
                case 4:                    
                    heroesList.add(new Arbalester(nameUn));
                    break;
                case 5:                    
                    heroesList.add(new Magician(nameUn));
                    break;    
                case 6:                    
                    heroesList.add(new Monk(nameUn));
                    break;
            }                  
        } 
       heroesList.forEach((n) -> {conOut.OutString(n.GetInfo());});        

    }
    
}