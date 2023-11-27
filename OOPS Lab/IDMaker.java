// a.Write an application that prompts a user for a full name and street address and constructs an ID from the user’s initials and numeric part of the address. For example, the user William Henry Harrison who lives at 34 Elm would have an ID of WHH34, 
// whereas user Addison Mitchell who lives at 1778 Monroe would have an ID of AM1778.
 import java.util.Scanner;
public class IDMaker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string;
        String id="";
        System.out.println("Enter the Address : ");
        string = scan.nextLine();
        char[] arr =  string.toCharArray();
        for(Character x : arr){
            if(Character.isUpperCase(x))
                id+=x;
            if(Character.isDigit(x)) 
                id+=x;      
        } 
            
        System.out.println("ID : "+id);
        scan.close();
    }
}