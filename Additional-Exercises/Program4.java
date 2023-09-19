class ConstraintException extends Exception {
    public ConstraintException(String message){
        super(message);
    }
}
public class Program4 {
    public static void main(String[] args) {
        try {
            if(args.length >= 2){
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                
                if (num1 <= 0 || num2 <= 0) {
                    throw new ConstraintException("Both numbers should be positive.");
                }
                
                if (num2 <= num1) {
                    throw new ConstraintException("The second value should be larger.");
                }
                
                System.out.println("Prime numbers between " + num1 + " and " + num2 + ":");
                printPrimeNumbers(num1, num2);
            }
            else{
                System.out.println("Provide 2 integer values");
            }
        } 
        catch (NumberFormatException e) {
            System.out.println("Please provide valid integers.");
        } 
        catch (ConstraintException ve) {
            System.out.println(ve.getMessage());
        }
    }

    public static void printPrimeNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
