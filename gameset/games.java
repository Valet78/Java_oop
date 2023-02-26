/*
 * Стартовый модуль
 */

package gameset;

import java.util.List;

import gameset.Heroes.Human;
// import gameset.Heroes.Sniper;

public class games {
    public static void main(String[] args) {
        Console conOut = new Console();

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

// LigthTeam

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

        // 3.2 Поиск среди противников наиболее приближённого. 
        // Attack ttr = new Attack();
        // // int zwer = ttr.SearchEnemy(LigthTeam.get(5), DarkTeam).get(0);
        // // int dist = ttr.SearchEnemy(LigthTeam.get(5), DarkTeam).get(1);
        // List<Integer> dist = ttr.SearchEnemy(LigthTeam.get(5), DarkTeam);
        // int zwer = dist.get(0);
        // conOut.OutString("zwer = " + zwer + " dist= " + dist);
        
        // 3.1 Если жизнь равна нулю или стрел нет, завершить оьработку.
        // Sniper Trewor = new Sniper();
        // // Trewor.SetHealthNom(0);
        // Trewor.SetArrows(10);
        // Trewor.Step();

        //3.4 Найти среди своих крестьянина.
        Attack ttr = new Attack();
        List<Integer> farmList = ttr.SearchFarmer(LigthTeam);
        if(farmList.size() > 0){ 
            farmList.forEach((x) -> {
                conOut.OutString(LigthTeam.get(x).GetName());
            });
        }
        else conOut.OutString("Нет в команде крестьянина.");
    }
    
}