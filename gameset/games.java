/*
 * Стартовый модуль
 */

package gameset;

import java.util.ArrayList;
// import java.util.ArrayList;
import java.util.List;
// import java.util.Random;

import gameset.Heroes.Human;
// import gameset.Heroes.Arbalester;
import gameset.Heroes.Bandit;
import gameset.Heroes.Farmer;
// import gameset.Heroes.Lancer;
import gameset.Heroes.Magician;
// import gameset.Heroes.Monk;
// import gameset.Heroes.Sniper;

public class games {
    public static void main(String[] args) {
        console conOut = new console();

        // Farmer vasya = new Farmer("Vasya");
        // Farmer unit1 = new Farmer();        
        // Bandit jack = new Bandit("Jack");
        // Bandit unit2 = new Bandit();
        // Lancer nik = new Lancer("Nikolas");
        // Lancer unit3 = new Lancer();        
        // Sniper den = new Sniper("Demino");
        // Sniper unit4 = new Sniper();
        // Arbalester sem = new Arbalester("Semuel");
        // Arbalester unit5 = new Arbalester();        
        // Magician dobr = new Magician("Dobrius");
        // Magician unit6 = new Magician();
        // Monk sand = new Monk("Sandos");
        // Monk unit7 = new Monk();
        
                        
        // vasya.GetInfo();
        // unit1.GetInfo();
        // System.out.println("--------------"); 
        // conOut.OutString(jack.GetInfo());
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


        // conOut.OutString(dobr.GetInfo());
        // System.out.println("--------------");        
        // attack df = new attack(vasya, dobr);
        // df.FizUron();
        // System.out.println("--------------");  
        // conOut.OutString(dobr.GetInfo());
        // System.out.println("--------------"); 
        // dobr.ddf(dobr.getClass().getName());


        // Составить список персонажей        
        Team rndTeam = new Team();
        List<Human> rndList = rndTeam.AddTeamRnd(10, "RndTeam"); // создадим 10 случайных персонажей
        rndList.forEach((n) -> {conOut.OutString(n.GetInfo());});
        conOut.OutString("--------------");

        // В первом только крестьянин, разбойник, снайпер или колдун. Во втором крестьянин, копейщик, арбалетчик, монах.
        // List<Integer> list1 = new ArrayList<Integer>() {};
        int[] list1 = new int[]{0, 1, 3, 5};
        int[] list2 = new int[]{0, 2, 4, 6};
        
        Team DarkHeroes = new Team();
        List<Human> DarkTeam = DarkHeroes.AddTeam(5, "DarkTeam", list2);
        DarkTeam.forEach((n) -> {conOut.OutString(n.GetInfo());});
        conOut.OutString("--------------");

        Team LigthHeroes = new Team();
        List<Human> LigthTeam = LigthHeroes.AddTeam(5, "LigthTeam", list1);
        LigthTeam.forEach((n) -> {conOut.OutString(n.GetInfo());});
        conOut.OutString("--------------");

    }
    
}