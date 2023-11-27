import java.util.Scanner;
class heloexcep extends Exception{
    heloexcep(String str){
        super(str);
    }    
}
public class helloexception{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter the String :");
        try{
            String str;
            str = scan.next();
            if(str.equals("hello")){
                throw new heloexcep("Hello is invalid");
            }
            else{
                System.out.println("String is : "+str);
            }
            
        } catch (heloexcep e) {
            System.out.println("Error : "+e.getMessage());
        }
        
    }
}
