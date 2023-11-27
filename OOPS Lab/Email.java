// Write a java program that reads a string from inputs containing first name, 
// last name and computes an e-mail address with first 3 letters of the first name, 
// first 4 letters of last name, ‘.’ separator and domain. Display the outputs by invoking objects.                                            
import java.util.Scanner;

class EmailAddress{
    private String fname;
    private String lname;
    EmailAddress(String fname,String lname){
        this.fname = fname;
        this.lname = lname;
    }
    public void generateemail(){
        String firstpart = "";
        String domain = "@gmail.com";
        firstpart+=fname.substring(0,3);
        firstpart+=lname.substring(0,4);
        firstpart+='.';
        System.out.println("Email address is : "+firstpart+domain);

    }
}

public class Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String F_Name;
        String L_Name;
        System.out.println("Enter First name : ");
        F_Name = scan.next();
        System.out.println("Enter Last name : ");
        L_Name = scan.next();
        EmailAddress email = new EmailAddress(F_Name, L_Name);
        email.generateemail();
        scan.close();
    }
}
