//To add two integers and raise exception when any other character except number (0 – 9) 
//is given as input

import java.util.Scanner;

class numberrangexception extends Exception{
    numberrangexception(String s){
        super(s);
    }
}

public class Numbercheckexc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Value should be in range 0-9 ");
            System.out.print("Enter value 1 : ");
            int a = scan.nextInt();
            System.out.print("Enter value 2 : ");
            int b = scan.nextInt();
            if(a<0 || a>9){
                throw new numberrangexception("Value 1 is out of range");
            }
            if (b<0 || b>9) {
                throw new numberrangexception("Value 2 is out of range");
            } else {
                System.out.println("Sum is : "+(a+b));
            }
        }
        catch(numberrangexception ne){
            System.out.println("Error : "+ ne.getMessage());
        }
    }
}