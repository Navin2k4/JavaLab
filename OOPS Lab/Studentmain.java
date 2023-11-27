import java.util.Scanner;

class student{
    String name;
    int roll;
    student(String name,int roll){
        this.name = name;
        this.roll=roll;
    }    
}

class result extends student{
    int m1,m2,m3;
    result(String name,int roll,int m1,int m2,int m3){
        super(name,roll);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    int gettotalmarks(){
        return m1+m2+m3;
    }
    String resultis(){
        int total = gettotalmarks();
        return (total>=100) ? "Pass" : "Fail";
    }
}

class sports extends result{
    int sportmark;
    sports(String name,int roll,int m1,int m2,int m3,int sportmark){
        super(name, roll, m1, m2, m3);
        this.sportmark = sportmark;
    }
    void displayresult(){
        System.out.println("Name        : " + name);
        System.out.println("Total Marks : " + gettotalmarks());
        System.out.println("Result      : " + resultis());
        System.out.println("Mark 1      : " + m1);
        System.out.println("Mark 2      : " + m2);
        System.out.println("Mark 3      : " + m3);        
        System.out.println("Sports Mark : " + sportmark);
    }
}

public class Studentmain{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        sports[] obj = new sports[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter detail for the student " + (i+1));
            System.out.print("Enter the name : ");
            String name = scan.next();
            System.out.print("Enter the roll number : ");
            int roll =  scan.nextInt();
            System.out.print("Enter mark 1 : ");
            int m1 = scan.nextInt();
            System.out.print("Enter mark 2 : ");
            int m2 = scan.nextInt();
            System.out.print("Enter mark 3 : ");
            int m3 = scan.nextInt();
            System.out.print("Enter sports mark : ");
            int sm = scan.nextInt();
            obj[i] = new sports(name, roll, m1, m2, m3, sm);
        }
        for (int i = 0; i < obj.length; i++) {
            obj[i].displayresult();
            System.out.print("\n");
        }
        scan.close();
    }
}
