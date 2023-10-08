
import java.util.*;
public class ApartmentException{
    Scanner scan=new Scanner(System.in);
    String stradd;
    int apartmentno;
    int bedno;
    double rent;
    public ApartmentException(String stradd,int apartmentno,int bedno,double rent)
    {
        this.stradd=stradd;
        this.apartmentno=apartmentno;
        this.bedno=bedno;
        this.rent=rent;
    }
   
    public String getstradd()
    {
        System.out.print("Enter the Street Address for Apartment:");
        stradd=scan.nextLine();
        return stradd;
    }
    public int getapartno()
    {
        System.out.print("Enter the Apartment Number:");
        apartmentno=scan.nextInt();
        return apartmentno;
    }
    public int getbedno()
    {
        System.out.print("Enter the Number of Bedrooms in Apartment:");
        bedno=scan.nextInt();
        return bedno;
    }
    public double getrent()
    {
        System.out.print("Enter the Rent Amount for Apartment:");
        rent=scan.nextDouble();
        return rent;
    }
    public String toString()
    {
        return ("Street Address:"+stradd+"\nStreet Apartment Number:"+apartmentno+"\nNo.Of.Bedrroms:"+bedno+"\nRent Amount: $"+rent+"\n");
    }
}