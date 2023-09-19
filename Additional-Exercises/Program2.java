import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        String a = scan.next();
        System.out.print("Enter number 2 : ");
        String b = scan.next();
        try{
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            int sum = num1 + num2 ;
            System.out.println("The sum is : "+ sum);
        }
        catch(NumberFormatException r){
            System.out.println("Input must be in the format of Integer.");
        }
    }
}
