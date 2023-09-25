package pack3;
class UDException extends Exception{
    public UDException(String message){
        super(message);
    }
}
public class calculator {
    double div;
    public int multiply(int a,int b){
        return a*b;
    }
    public double divide(double a,double b){
        try{
            if(b==0){
            throw new Exception("Do not enter 0 as denominator.");    
            }
            else{
            div=a/b;
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return div;
    }
}
