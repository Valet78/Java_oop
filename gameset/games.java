/*
 * Стартовый модуль
 */

package gameset;

import java.util.List;
import java.util.Scanner;

// import gameset.Heroes.Arbalester;
import gameset.Heroes.Human;
// import gameset.Heroes.Sniper;

public class games{
    public static void main(String[] args) {
        Console cons = new Console();
        
        // Составить список персонажей        
        // Team rndTeam = new Team();
        // List<Human> rndList = rndTeam.AddTeamRnd(10, "RndTeam"); // создадим 10 случайных персонажей
        // rndList.forEach((n) -> {conOut.OutString(n.GetInfo());});
        // conOut.OutString("--------------");

        // В первом только крестьянин, разбойник, снайпер, колдун. Во втором крестьянин, копейщик, арбалетчик, монах.        
        int[] list1 = new int[]{0, 1, 3, 5};
        int[] list2 = new int[]{0, 2, 4, 6};
        
        Team DarkHeroes = new Team();
        List<Human> DarkTeam = DarkHeroes.AddTeam(10, "DarkUnit", list2);
        // DarkTeam.forEach((n) -> {conOut.OutString(n.GetInfo() + "     \t- " + n.GetNameTeam());});
        cons.OutString("--------------");

        Team LigthHeroes = new Team();
        List<Human> LigthTeam = LigthHeroes.AddTeam(10, "LigthUnit", list1);        
        // LigthTeam.forEach((n) -> {conOut.OutString(n.GetInfo() + "     \t- " + n.GetNameTeam());});
        cons.OutString("--------------");

        // LigthTeam

        /*  Создать класс с описанием координат, x и y.
            Добавить в абстрактный класс поле с координатами и пробросить его инициализацию до конструкторов персонажей.
            Farmer farmer = new Farmer(getName(), x, y);
            Реализовать метод step() лучников. 
            3.1 Если жизнь равна нулю или стрел нет, завершить оьработку. 
            3.2 Поиск среди противников наиболее приближённого.             -> Attack.java
            3.3 Нанести среднее повреждение найденному противнику. 
            3.4 Найти среди своих крестьянина.                              -> Attack.java
            3.5 Если найден завершить метод иначе уменьшить запас стрел на одну. 
        */

        
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
            // Аттака светлых
            if (DarkTeam.size() > 0){
                LigthTeam.forEach((n) -> {
                    n.Step(n, LigthTeam, DarkTeam);
                });
                // Проверка оствшихся в живых
                att.DelCorpse(DarkTeam);
            }
            // Аттака темных
            if(LigthTeam.size() > 0){
                DarkTeam.forEach((n) -> {
                    n.Step(n, DarkTeam, LigthTeam);
                });
                // Проверка оствшихся в живых
                att.DelCorpse(LigthTeam);
            }
            

            System.out.println("Для выполнения хода введите любой символ. Для выхода Ctrl + 'C'.");
            tpause = instr.next();
            
        }
        instr.close();

        cons.OutTab(DarkTeam, LigthTeam);

    }
    
}