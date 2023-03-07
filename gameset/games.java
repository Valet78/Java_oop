/*
 * Стартовый модуль
 */

package gameset;

import java.util.List;
import java.util.Scanner;

import gameset.Heroes.Human;

public class games{
    static List<Human> LigthTeam = null, DarkTeam = null;

    public static void main(String[] args) {
        Console cons = new Console();
        ;
        // Составить список персонажей        
        // Team rndTeam = new Team();
        // List<Human> rndList = rndTeam.AddTeamRnd(10, "RndTeam"); // создадим 10 случайных персонажей
        // rndList.forEach((n) -> {conOut.OutString(n.GetInfo());});
        // conOut.OutString("--------------");

        // В первом только крестьянин, разбойник, снайпер, колдун. Во втором крестьянин, копейщик, арбалетчик, монах.        
        int[] list1 = new int[]{0, 2, 3, 6};
        int[] list2 = new int[]{0, 1, 4, 5};
        
        // DarkTeam
        Team DarkHeroes = new Team();
        DarkTeam = DarkHeroes.AddTeam(10, "DarkUnit", list2);        
        
        // LigthTeam
        Team LigthHeroes = new Team();
        LigthTeam = LigthHeroes.AddTeam(10, "LigthUnit", list1);        
        
        
        // Если в команде светлых есть лучник/снайпер даем ему ход
        
      /*   LigthTeam.forEach((n) ->{
            if(n instanceof Sniper) {
                n.Step(n, LigthTeam, DarkTeam);
            } 
        });

        DarkTeam.forEach((x) -> {
            if(x.GetHealthNom() == 0){
                conOut.OutString(x.GetName() + " погиб!");
            } 
            else conOut.OutString(x.GetName() + " health=" + x.GetHealthNom());
        });
        conOut.OutString("--------------");

        // Теперь ходим арбалетчиком Тёмных
        DarkTeam.forEach((n) ->{
            if(n instanceof Arbalester) {
                n.Step(n, DarkTeam, LigthTeam);
            } 
        });

        LigthTeam.forEach((x) -> {
            if(x.GetHealthNom() == 0){
                conOut.OutString(x.GetName() + " погиб!");
            } 
            else conOut.OutString(x.GetName() + " health=" + x.GetHealthNom());
        }); */        
     
        
        
        String tpause = "";
        Scanner instr = new Scanner(System.in);
        Attack att = new Attack();
        

        while(LigthTeam.size() > 0 && DarkTeam.size() > 0){  
            cons.OutTab(DarkTeam, LigthTeam);
            cons.GamePlatz(LigthTeam, DarkTeam);
            // Аттака светлых
            if (DarkTeam.size() > 0){
                LigthTeam.forEach((n) -> {
                    n.Step(n, LigthTeam, DarkTeam);
                });
                // Проверка оставшихся в живых
                DarkTeam = att.DelCorpse(DarkTeam);
                
            }
            // Аттака темных
            if(LigthTeam.size() > 0){
                DarkTeam.forEach((n) -> {
                    n.Step(n, DarkTeam, LigthTeam);
                });
                // Проверка оставшихся в живых
                LigthTeam = att.DelCorpse(LigthTeam);

                
            }
            
            System.out.println("Для выполнения хода нажмте Enter. Для выхода Ctrl + 'C'.");
            tpause = instr.nextLine();
            
            
        }
        instr.close();
        cons.OutString("Игра закончена!!!");
        if(DarkTeam.size() == 0) cons.OutString("Победила команда Светлых!");
        else cons.OutString("Победила команда Тёмных!");
        cons.OutTab(DarkTeam, LigthTeam);
        
        

    }
    
}