import java.util.Scanner;
public class CheckEmail {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your email : ");
        String email = scan.nextLine();
        int email_length = email.length();
        char email_array[] = email.toCharArray();
        int count_a = 0 ;
        for (char c : email_array){if(c=='@'){count_a++;}}
        if (count_a > 1) {
        if (email.charAt(0) == '@' || email.charAt(email_length - 1) == '@') {
        if (!email.contains("@")){
        if (!(email.indexOf('@') < email.indexOf('.'))) {System.out.println("Email not valid"); } } } } 
        else if (!(email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$"))) {System.out.println("Email is not Valid");}
        else{System.out.println("Email address is valid");}
        scan.close();
    }
}

// OUTPUT
// Enter your email : example
// Email is not Valid
// Enter your email : example@
// Email is not Valid
// Enter your email : example@gmail
// Email is not Valid
// Enter your email : example@gmail.com
// Email address is valid