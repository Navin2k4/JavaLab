import java.util.Scanner;

public class Program1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.print("Enter the String : ");
            String str = scan.next();
            if(str.equals("hello")){
                throw new Exception(str +" is Not valid statement");
            }
            else{
                System.out.println(str);
            }
        }
        catch(Exception  e){
            System.out.println(e.getMessage());
        }
    }
}