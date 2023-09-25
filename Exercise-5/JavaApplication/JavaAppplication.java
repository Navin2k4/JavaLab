
package JavaApplication;

import java.util.Scanner;
import pack1.*;
import pack2.*;
import pack3.*;

public class JavaAppplication {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int choice,num1,num2;
        String str1,str2;
        
        MathOperation Mat = new MathOperation();
        StringOperation Str = new StringOperation();
        calculator Calc = new calculator();
        
        System.out.println("1.Addition \n2.Subraction \n3.Multiply \n4.Divide \n5.String concatenate \n6.String reverse \n7.Exit");
        do{
        System.out.print("\nEnter the choice : ");
        choice = scan.nextInt(); 

            switch(choice){
                case 1:
                    System.out.print("Enter Number 1 : ");
                    num1 = scan.nextInt();
                    System.out.print("Enter Number 2 : ");
                    num2 = scan.nextInt();
                    System.out.println("Sum is : " + Mat.add(num1, num2));
                    break;
                case 2:
                    System.out.print("Enter Number 1 : ");
                    num1 = scan.nextInt();
                    System.out.print("Enter Number 2 : ");
                    num2 = scan.nextInt();
                    System.out.println("Difference is : " + Mat.subtact(num2, num1));
                    break;
                case 3:
                    System.out.print("Enter Number 1 : ");
                    num1 = scan.nextInt();
                    System.out.print("Enter Number 2 : ");
                    num2 = scan.nextInt();
                    System.out.println("Multiplication is is : " + Calc.multiply(num1, num2));
                    break;
                case 4:
                    System.out.print("Enter Number 1 : ");
                    num1 = scan.nextInt();
                    System.out.print("Enter Number 2 : ");
                    num2 = scan.nextInt();
                    System.out.println("Divide is : " + Calc.divide((double)num1, (double)num2));
                    break;
                case 5:
                    System.out.print("\nEnter String 1 : ");
                    str1 = scan.next();
                    System.out.print("Enter String 2 : ");
                    str2 = scan.next();
                    System.out.print("Concatenated Sting is : " + Str.concatenate(str1, str2));
                    break;
                case 6:
                    System.out.print("\nEnter String : ");
                    str1 = scan.next();
                    System.out.print("Reversed String is : " + Str.reverse(str1));
                    break;
                case 7:
                    System.out.print("Exiting Program\n");
                    break;
                default:
                    System.out.print("Invalid Choice\n");
                    break;
            }
       }while(choice!=7);
    }
}
