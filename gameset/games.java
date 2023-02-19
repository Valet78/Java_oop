/*
 * Стартовый модуль
 */

package gameset;

// import gameset.Heroes.Arbalester;
// import gameset.Heroes.Bandit;
import gameset.Heroes.Farmer;
// import gameset.Heroes.Lancer;
import gameset.Heroes.Magician;
// import gameset.Heroes.Monk;
// import gameset.Heroes.Sniper;

public class games {
    public static void main(String[] args) {
        Farmer vasya = new Farmer("Vasya");
        // Farmer unit1 = new Farmer();
        
        // Bandit jack = new Bandit("Jack");
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
        // jack.GetInfo();
        // unit2.GetInfo();
        // System.out.println("--------------");
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


        dobr.GetInfo();
        System.out.println("--------------");        
        attack df = new attack(vasya, dobr);
        df.FizUron();
        System.out.println("--------------");  
        dobr.GetInfo();



    }
    
}