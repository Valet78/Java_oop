/*
 * Стартовый модуль
 */

package gameset;

import java.util.List;

import gameset.Heroes.Human;

public class games {
    public static void main(String[] args) {
        console conOut = new console();

        // Farmer vasya = new Farmer("Vasya");
        // Farmer unit1 = new Farmer();   


        // Составить список персонажей        
        // Team rndTeam = new Team();
        // List<Human> rndList = rndTeam.AddTeamRnd(10, "RndTeam"); // создадим 10 случайных персонажей
        // rndList.forEach((n) -> {conOut.OutString(n.GetInfo());});
        // conOut.OutString("--------------");

        // В первом только крестьянин, разбойник, снайпер или колдун. Во втором крестьянин, копейщик, арбалетчик, монах.        
        int[] list1 = new int[]{0, 1, 3, 5};
        int[] list2 = new int[]{0, 2, 4, 6};
        
        Team DarkHeroes = new Team();
        List<Human> DarkTeam = DarkHeroes.AddTeam(10, "DarkUnit", list2);
        DarkTeam.forEach((n) -> {conOut.OutString(n.GetInfo() + "     \t- " + n.GetNameTeam());});
        conOut.OutString("--------------");

        Team LigthHeroes = new Team();
        List<Human> LigthTeam = LigthHeroes.AddTeam(10, "LigthUnit", list1);
        
        LigthTeam.forEach((n) -> {conOut.OutString(n.GetInfo() + "     \t- " + n.GetNameTeam());});
        conOut.OutString("--------------");



        /*  Создать класс с описанием координат, x и y.
            Добавить в абстрактный класс поле с координатами и пробросить его инициализацию до конструкторов персонажей.
            Farmer farmer = new Farmer(getName(), x, y);
            Реализовать метод step() лучников. 
            3.1 Если жизнь равна нулю или стрел нет, завершить оьработку. 
            3.2 Поиск среди противников наиболее приближённого. 
            3.3 Нанести среднее повреждение найденному противнику. 
            3.4 Найти среди своих крестьянина. 
            3.5 Если найден завершить метод иначе уменьшить запас стрел на одну. 
        */

    }
    
}