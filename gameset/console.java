package gameset;

import java.util.ArrayList;
import java.util.List;

import gameset.Heroes.Arbalester;
import gameset.Heroes.Human;
import gameset.Heroes.Magi;
import gameset.Heroes.Magician;
import gameset.Heroes.Monk;
import gameset.Heroes.Shooter;
import gameset.Heroes.Sniper;

public class Console{
    static String forma = "", formZag = "",razdel = "";  
    static int inS = 0, inK = 0, stepNum = 0;  
    static List<String> listStrOut = new ArrayList<String>(6);
    
    public Console(){}

    public void OutString (String instr){
        System.out.println(instr);
    }
/* 
    public void OutTab(List<Human> list1, List<Human> list2){
        int len1 = list1.size(), len2 = list2.size();
        int indLen = (len1 > len2) ? len1: len2;
        System.out.println("\033[2J");
        razdel = "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
        formZag = "%1s %15s %1s %15s %1s %8s %1s %6s %1s %6s %1s %12s %1s %6s %1s %15s %1s %15s %1s %8s %1s %6s %1s %6s %1s %12s %1s";
        forma   = "%1s %15s %1s %15s %1s %8s %1s %6s %1s %6s %1s %21s %1s %6s %1s %15s %1s %15s %1s %8s %1s %6s %1s %6s %1s %21s %1s";
                

        System.out.print("\u001B[32m");
        System.out.println("\n" + razdel);        
        System.out.printf(formZag, 
                        "|", "Type", "|", "Name", "|", "Location", "|", "HPmax", "|", "HPnom",  "|", "MPnom",  "|", "< >",
                                 "|", "Type", "|", "Name", "|", "Location", "|", "HPmax", "|", "HPnom",  "|", "MPnom",  "|");
        System.out.println("\n" + razdel);
        System.out.print("\u001B[0m");
        String tmm1 = "", tmm2 = "", tmm3 = "", tmm4 = "", tmm5 = "", tmm6 = "", tmm7 = "", tmm8 = "", tmm9 = "", tmm10 = "", tmm11 = "", tmm12 = "", tmm13 = "";
        
        for(int i = 0; i < indLen; i++){
            if(i < list1.size()){
                tmm1 = list1.get(i).GetInfo();
                tmm2 = list1.get(i).GetName();
                tmm3 = "[" + Integer.toString(list1.get(i).GetLocation().get(0)) + ", " + Integer.toString(list1.get(i).GetLocation().get(1)) + "]";
                tmm4 = Integer.toString(list1.get(i).GetHealthMax());            
                tmm5 = Integer.toString(list1.get(i).GetHealthNom());
                tmm6 = AddToString(list1.get(i));
            } 
            else {
                tmm1 = "         ";
                tmm2 = "         ";
                tmm3 = "     ";            
                tmm4 = "  ";
                tmm5 = "  ";
                tmm6 = "  ";
            }            
            tmm7 = "< >" ;

            if(i < list2.size()){
                tmm8 = list2.get(i).GetInfo();
                tmm9 = list2.get(i).GetName();
                tmm10 = "[" + Integer.toString(list2.get(i).GetLocation().get(0)) + ", " + Integer.toString(list2.get(i).GetLocation().get(1)) + "]";
                tmm11 = Integer.toString(list2.get(i).GetHealthMax());            
                tmm12 = Integer.toString(list2.get(i).GetHealthNom());
                tmm13 = AddToString(list2.get(i));
            }
            else {                
                tmm8 = "         ";            
                tmm9 = "         ";
                tmm10 = "     ";            
                tmm11 = "  ";
                tmm12 = "  ";            
                tmm13 = "  ";
            }        
            System.out.printf(forma, 
                            "|", tmm1, "|", tmm2, "|", tmm3, "|", tmm4, "|", tmm5, "|", tmm6, "|", tmm7, 
                                    "|", tmm8, "|", tmm9, "|", tmm10, "|", tmm11, "|", tmm12, "|", tmm13, "|");
            System.out.println();
        }
    

        System.out.print("\u001B[32m");
        System.out.println(razdel);
        System.out.println("\u001B[0m");
    }
 */
    private String AddToString(Human inHuman){
        String ttp = "";       
            if(inHuman instanceof Sniper || inHuman instanceof Arbalester){
                ttp = "\u001B[31m" + Integer.toString(((Shooter) inHuman).GetArrows()) + "\u001B[0m";
            }
            else if(inHuman instanceof Magician || inHuman instanceof Monk){
                ttp = "\u001B[34m" + Integer.toString(((Magi) inHuman).GetMannaNom()) + "\u001B[0m";
            }
            else {
                ttp = "\u001B[37m \u001B[0m";
            }
        return ttp;       
    }

    public void GamePlatz(List<Human> list1, List<Human> list2, int stepNum){
        String [][] field = new String[10][20];
        String [][] plaz = new String[21][41];

        for (int s = 0; s < 10; s++) {
            for (int k = 0; k < 20; k++) {
                field[s][k] = " ";
            }
        }        
        
        list1.forEach((n) -> {
            inK = n.GetLocation().get(0);
            inS = n.GetLocation().get(1);
            field[inS][inK] = "\u001b[36m"  + Label(n.getClass().getName()) + "\u001b[0m";            
        });
        list2.forEach((n) -> {
            inK = n.GetLocation().get(0);
            inS = n.GetLocation().get(1);
            field[inS][inK] = "\u001b[31m"  + Label(n.getClass().getName()) + "\u001b[0m";            
        });

        
        for (int s = 0; s < 21; s++) {
            for (int k = 0; k < 41; k++) {
                if(s == 0 || s % 2 == 0){
                    plaz[s][k] = "-";
                } else {
                    if(k == 0 || k % 2 == 0) plaz[s][k] = "|";
                    else plaz[s][k] = field[s / 2][k / 2];
                }
                
            }
        }        

        // Вывод на экран        
        System.out.println("\033[2J");
        String repeat1 = new String(new char[45]).replace("\0", " ");
        String repeat2 = new String(new char[75]).replace("\0", "-");
        razdel = repeat1 + repeat2;
        formZag = "%-44s %15s %1s %15s %1s %8s %1s %6s %1s %6s %1s %8s";
        forma = "%19s %1s %15s %1s %8s %1s %6s %1s %6s %1s %8s %n";
        
        
        System.out.print("\u001B[32m");
        System.out.println("\n"+ razdel);
        System.out.printf(formZag, "Ход № " + Integer.toString(stepNum), "Type", "|", "Name", "|", "Location", "|", "HPmax", "|", "HPnom",  "|", "MPnom");
        System.out.println("\n"+ razdel);
        System.out.print("\u001B[0m");

        for(int s = 0; s < 21; s++){
            for(int k=0; k < 41; k++) {
                System.out.print(plaz[s][k]);                
            }
            // System.out.println();
            if(s == 10) System.out.println("    " + repeat2);
            if(s >= 0 && s < 10){
                listStrOut = StringForTab(list1, s);
                System.out.printf(forma, listStrOut.get(0), "|", listStrOut.get(1), "|", listStrOut.get(2), 
                                    "|", listStrOut.get(3), "|", listStrOut.get(4), "|", listStrOut.get(5));

            }
            if(s > 10 && s < 21){
                listStrOut = StringForTab(list2, s - 11);
                System.out.printf(forma, listStrOut.get(0), "|", listStrOut.get(1), "|", listStrOut.get(2), 
                                    "|", listStrOut.get(3), "|", listStrOut.get(4), "|", listStrOut.get(5));
            }          
            // System.out.println();  
        }
        System.out.println();
    }

    private String Label(String nameClass){
        String tmpStr = "";
        switch (nameClass) {
            case "gameset.Heroes.Farmer":
                tmpStr = "F";
                break;
            case "gameset.Heroes.Bandit":
                tmpStr = "B";
                break;                
            case "games.Heroes.Sniper":
                tmpStr = "S";
                break;
            case "gameset.Heroes.Arbalester":
                tmpStr = "A";
                break;   
            case "gameset.Heroes.Magician":
                tmpStr = "M";
                break;   
            case "gameset.Heroes.Monk":
                tmpStr = "X";
                break;     
            case "gameset.Heroes.Lancer":
                tmpStr = "L";
                break;    
        
            default:
                tmpStr = " ";
                break;
        }  
        return tmpStr;
    }

    private List<String> StringForTab (List<Human> inList, int indList){
        List<String> tmpList = new ArrayList<>(6);

        if(indList < inList.size()){
            tmpList.add(inList.get(indList).GetInfo());
            tmpList.add(inList.get(indList).GetName());
            tmpList.add("[" + Integer.toString(inList.get(indList).GetLocation().get(0)) + ", " + Integer.toString(inList.get(indList).GetLocation().get(1)) + "]");
            tmpList.add(Integer.toString(inList.get(indList).GetHealthMax()));            
            tmpList.add(Integer.toString(inList.get(indList).GetHealthNom()));
            tmpList.add(AddToString(inList.get(indList)));
        } 
        else {
            tmpList.add("         ");
            tmpList.add("         ");
            tmpList.add("     ");            
            tmpList.add("  ");
            tmpList.add("  ");
            tmpList.add("  ");        
        }

        return tmpList;
    }
}

