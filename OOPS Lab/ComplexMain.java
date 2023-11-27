//Addition : (a+bi)+(c+di)=(a+c)+(b+d)i
//Subraction : (a+bi)−(c+di)=(a−c)+(b−d)i
//Multiplication :  (a+bi)×(c+di)=(ac−bd)+(ad+bc)i

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real,double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public void add(Complex other){
        this.real += other.real;
        this.imaginary += other.imaginary;

    }
    public void sub(Complex other){
        this.real -= other.real;
        this.imaginary = other.imaginary;
    }
    public void mul(Complex other){
        double tempreal = (this.real*other.real) - (this.imaginary*other.imaginary);
        double tempimg = (this.real*other.real) + (this.imaginary*other.imaginary);
        this.real = tempreal;
        this.imaginary = tempimg;
    }
    public void div(Complex other){
        double divisor = (other.real*other.real) + (other.imaginary*other.imaginary);
        double tempreal = ((this.real*other.real) + (this.imaginary*other.imaginary))/divisor;
        double tempimg = ((this.imaginary*other.real)-(this.real*other.imaginary))/divisor;
        this.real = tempreal;
        this.imaginary = tempimg;

    }

    public String toString(){
        if(imaginary>=0){
            return real +" + "+imaginary+"i";
        }
        else{
            return real +" - "+Math.abs(imaginary)+"i";
        }
    }
}
public class ComplexMain{
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(3, -4);
        c1.add(c2);
        System.out.println("Addition : "+ c1);
        c1 = new Complex(2, 3);
        c1.sub(c2);
        System.out.println("Subraction : "+c1);
        c1 = new Complex(2, 3);
        c1.mul(c2);
        System.out.println("Multiplication : "+c1);        
        c1 = new Complex(2, 3);
        c1.div(c2);
        System.out.println("Division : "+c1);
    }
}
