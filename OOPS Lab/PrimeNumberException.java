class PositiveIntegerException extends Exception { 
    public PositiveIntegerException(String message) { 
        super(message); 
    } 
} 
class SecondIntegerLargerException extends Exception { 
    public SecondIntegerLargerException(String message) { 
        super(message); 
    } 
}

public class PrimeNumberException {
    public static void main(String[] args) {
    try { 
        int num1 = Integer.parseInt(args[0]); 
        int num2 = Integer.parseInt(args[1]); 
        if (num1 <= 0 || num2 <= 0) { 
            throw new PositiveIntegerException("Both numbers should be positive integers."); 
        } 
        if (num2 <= num1) { 
            throw new SecondIntegerLargerException("Second number should be larger than the first."); 
        } 
        System.out.println("Prime numbers between " + num1 + " and " + num2 + ":"); 
        for(int i = num1;i<=num2;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
    catch (NumberFormatException e) { 
        System.out.println("Exception: Please enter valid integers as arguments."); 
    } 
    catch (PositiveIntegerException | SecondIntegerLargerException e) { 
        System.out.println("Exception: " + e.getMessage()); }
    }
    
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }


}
