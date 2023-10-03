import java.util.Scanner;

public class ExceptionProgram {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try
    {
        System.out.print("Enter a value : ");
        int a = scan.nextInt();
        System.out.print("Enter b value : ");
        int b = scan.nextInt();
        int c = a / b;
        System.out.println("Result = " + c);

        System.out.print("Enter the string with length 5 : ");
        String str1 = scan.next(); 
        System.out.print("Enter the index value of String : ");
        int index = scan.nextInt();
        char char1 = str1.charAt(index); 
        System.out.println(char1);

        System.out.print("Enter the number of element in array : ");
        int length = scan.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Element "+(i+1));
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the index of the array : ");
        index = scan.nextInt();
        System.out.println(arr[index]);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println ("Array Index is Out Of Bounds");
    } 
    catch (StringIndexOutOfBoundsException e) {
        System.out.println("StringIndexOutOfBoundsException");
    }
    catch(ArithmeticException e){
        System.out.println("Can't divide a number by 0");
    }    
    catch(NumberFormatException e){
        System.out.println("NumberFormatException");
    }
    }
}

///Common Program
///Write a Java program for handling the following exceptions
/// (i) Arithmetic Exception           (ii) ArrayIndexOutOfBounds Exception 
/// (iii) NumberFormatException  (iv) StringIndexOutOfBound Exception
