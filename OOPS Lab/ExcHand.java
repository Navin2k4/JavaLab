// Create a class Doctor with attributes id, name, age and department. 
// Initialize values through parameterized constructor. 
// If age of Doctor is not in between 25 and 65 then generate 
// user-defined exception “AgeNotWithinRangeException”. 
// If name contains numbers or special symbols raise exception “NameNotValidException”. 
// Define the two exception classes.

import java.util.Scanner;

class  AgeNotWithinRangeException extends Exception{
    AgeNotWithinRangeException(String s){
        super("Age of Doctor is not in between 25 and 65");
    }
}
class NameNotValidException extends Exception{
    NameNotValidException(String s){
        super("Name contains numbers or special symbols");
    }
}
class Doctor{
    int id,age;
    String name,dept;
    Doctor(int id,String name,int age,String dept){
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
    public String toString(){
        return "Name : "+name+
               " Id : "+id+
               " Age : "+age+
               " Department : "+dept;
    }
}

public class ExcHand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            int id,age;
            String name,dept;
            System.out.print("Enter the number of persons :");
            int n = scan.nextInt();
            Doctor[] doctor = new Doctor[n];
            for(int i=0;i<n;i++){
                    System.out.print("Name       : ");
                    name = scan.next();
                    if(!name.matches("[a-zA-Z]+")){
                        throw new NameNotValidException("Name is not valid");
                    }
                    System.out.print("ID         : ");
                    id = scan.nextInt();
                    System.out.print("Age        : ");
                    age = scan.nextInt();
                    if(age<25 || age>65){
                        throw new AgeNotWithinRangeException("Enter the ge within the given range");
                    }
                    System.out.print("Department : ");
                    dept = scan.next();
                    doctor[i] =new Doctor(id, name, age, dept);
                    System.out.print("\n");
                    System.out.print(doctor[i]);         
           }
        }
        catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
