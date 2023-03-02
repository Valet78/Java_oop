package gameset;

// import java.util.ArrayList;
import java.util.List;

import gameset.Heroes.Human;

public class Console{
    
    public Console(){}

    public void OutString (String instr){
        System.out.println(instr);
    }

    public void OutTab(List<Human> list1, List<Human> list2){
        int len1 = list1.size(), len2 = list2.size();
        int indLen = (len1 >= len2) ? len1: len2;

        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %1s %15s %1s %8s %1s %6s %1s %6s %5s %15s %1s %15s %1s %8s %1s %6s %1s %6s", 
                        "Type", "|", "Name", "|", "Location", "|", "HPmax", "|", "HPnom", "< >", "Type", "|", "Name", "|", "Location", "|", "HPmax", "|", "HPnom");
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------------");
        String tmm1 = "", tmm2 = "", tmm3 = "", tmm4 = "", tmm5 = "", tmm6 = "", tmm7 = "", tmm8 = "", tmm9 = "", tmm10 = "", tmm11 = "";
        for(int i = 0; i < indLen; i++){
            if(i < len1){
                tmm1 = list1.get(i).GetInfo();
                tmm2 = list1.get(i).GetName();
                tmm3 = "[" + Integer.toString(list1.get(i).GetLocation().get(0)) + ", " + Integer.toString(list1.get(i).GetLocation().get(1)) + "]";
                tmm4 = Integer.toString(list1.get(i).GetHealthMax());            
                tmm5 = Integer.toString(list1.get(i).GetHealthNom());
            } 
            else {
                tmm1 = " ";
                tmm2 = " ";
                tmm3 = " ";            
                tmm4 = " ";
                tmm5 = " ";
            }            
            tmm6 = "< >" ;
            if(i < len2){
                tmm7 = list2.get(i).GetInfo();
                tmm8 = list2.get(i).GetName();
                tmm9 = "[" + Integer.toString(list2.get(i).GetLocation().get(0)) + ", " + Integer.toString(list2.get(i).GetLocation().get(1)) + "]";
                tmm10 = Integer.toString(list2.get(i).GetHealthMax());            
                tmm11 = Integer.toString(list2.get(i).GetHealthNom());
            }
            else {
                tmm6 = " ";
                tmm7 = " ";
                tmm8 = " ";            
                tmm9 = " ";
                tmm10 = " ";            
                tmm11 = " ";
            }        
            System.out.printf("%15s %1s %15s %1s %8s %1s %6s %1s %6s %5s %15s %1s %15s %1s %8s %1s %6s %1s %6s", 
                            tmm1, "|", tmm2, "|", tmm3, "|", tmm4, "|", tmm5, tmm6, tmm7, "|", tmm8, "|", tmm9, "|", tmm10, "|", tmm11);
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }

    /* 
    // Create an Empty List of Student, And add few objects to the List
    List&amp;amp;amp;amp;amp;lt;Student&amp;amp;amp;amp;amp;gt; students = new ArrayList&amp;amp;amp;amp;amp;lt;Student&amp;amp;amp;amp;amp;gt;();
    List<&amp;amp;amp;amp;amp;> Student &amp;amp;amp;amp;amp;gt; students = new ArrayList&amp;amp;amp;amp;amp;lt;Student&amp;amp;amp;amp;amp;gt;();
    students.add(new Student("ST001", "James Smith", "james_smith@gmail.com", 23, 'A'));
    students.add(new Student("ST002", "Philip Duncan", "philip_duncan@gmail.com", 22, 'c'));
    students.add(new Student("ST003", "Patrick Fixler", "patrick_fixler@gmail.com", 25, 'b'));
    students.add(new Student("ST004", "Nancy Goto", "nancy_goto@gmail.com", 24, 'A'));
    students.add(new Student("ST005", "Maria Hong", "maria_hong@gmail.com", 22, 'e'));
 
    // Print the list objects in tabular format.
    System.out.println("-----------------------------------------------------------------------------");
    System.out.printf("%10s %30s %20s %5s %5s", "STUDENT ID", "EMAIL ID", "NAME", "AGE", "GRADE");
    System.out.println();
    System.out.println("-----------------------------------------------------------------------------");
    for(Student student: students){
        System.out.format("%10s %30s %20s %5d %5c",
                student.getId(), student.getEmailId(), student.getName(), student.getAge(), student.getGrade());
        System.out.println();
    }
    System.out.println("-----------------------------------------------------------------------------"); 
    */
}

