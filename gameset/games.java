/*
 * Стартовый модуль
 */

package gameset;

import gameset.Heroes.Arbalester;
import gameset.Heroes.Bandit;
import gameset.Heroes.Farmer;
import gameset.Heroes.Lancer;
import gameset.Heroes.Magician;
import gameset.Heroes.Monk;
import gameset.Heroes.Sniper;

public class games {
    public static void main(String[] args) {
        Farmer vasya = new Farmer("Vasya");
        Bandit jack = new Bandit("Jack"); 
        Lancer nik = new Lancer("Nikolas");
        Sniper den = new Sniper("Demino");
        Arbalester sem = new Arbalester("Semuel");
        Magician dobr = new Magician("Dobrius");
        Monk sand = new Monk("Sandos");
        Lancer unit = new Lancer();

        vasya.GetInfo();
        System.out.println("--------------");        
        attack df = new attack(dobr, vasya);
        df.FizUron();

        System.out.println("--------------");                  
        vasya.GetInfo();
        jack.GetInfo();
        nik.GetInfo();
        den.GetInfo();
        sem.GetInfo();
        dobr.GetInfo();
        sand.GetInfo();
        unit.GetInfo();

    }
    
}