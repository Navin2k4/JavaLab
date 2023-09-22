import java.util.Scanner;
import Year1.Year_I_Marks;
import Year2.Year_II_Marks;
public class Student {
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
    }
        public static void main(String[] args) {
            String name;
            int rollno,sub1,sub2,sub3,sub4;
            Scanner scan =  new Scanner(System.in);
            System.out.print("Enter the number of students : ");
            int n = scan.nextInt();    
            Student[] student = new Student[n];
            Year_I_Marks[] y1 = new Year_I_Marks[n];
            Year_II_Marks[] y2 = new Year_II_Marks[n];
            for (int i = 0; i < n; i++) {
                System.out.print("\nEnter the Roll-No : ");
                rollno = scan.nextInt();
                System.out.print("Enter the name : ");
                name= scan.next();
                System.out.print("Enter Year I marks : ");
                sub1 = scan.nextInt();
                sub2 = scan.nextInt();
                y1[i] = new Year_I_Marks(sub1,sub2);
                System.out.print("Enter Year II marks : ");
                sub3 = scan.nextInt();
                sub4 = scan.nextInt();
                y2[i] = new Year_II_Marks(sub3,sub4);
                student[i] = new Student(name,rollno);
            }

            for (int i = 0; i < n; i++) {
                System.out.println("\nName : "
                                    + student[i].name 
                                    + "\nRoll : "
                                    + student[i].rollno
                                  );
                System.out.println("Year I Marks  : " 
                                    + y1[i].sub1Marks 
                                    + ((y1[i].sub1Marks > 50) ? "-Pass" : "-Fail") 
                                    + "  " + y1[i].sub2Marks 
                                    + ((y1[i].sub2Marks > 50) ? "-Pass" : "-Fail")
                                  );
                System.out.println("Year II Marks : " 
                                    + y2[i].sub3Marks 
                                    + ((y2[i].sub3Marks > 50) ? "-Pass" : "-Fail") 
                                    + "  " + y1[i].sub2Marks 
                                    + ((y2[i].sub4Marks > 50) ? "-Pass" : "-Fail")
                                  );
            }
        }


}


