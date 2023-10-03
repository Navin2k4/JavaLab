package Exercise6.Program1;
import java.util.Scanner;

import Exercise6.Program1.AppartmantException;
import Exercise6.Program1.Appartment;
public class ThrowAppartmentException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Appartments : ");
        int no_of_appartment = scan.nextInt();
        String Address;
        int Number,NoOfBedrooms,rent;
        Appartment[] app = new Appartment[no_of_appartment];
        AppartmantException[] exc = new AppartmantException[no_of_appartment];
        for (int i = 0; i < no_of_appartment; i++) {
            System.out.print("Address : ");
            Address = scan.next();
            System.out.print("No : ");
            Number = scan.nextInt();
            System.out.print("No of Bedrooms : ");
            NoOfBedrooms = scan.nextInt();
            System.out.print("Rent : ");
            rent = scan.nextInt();
            app[i] = new Appartment(Address,Number,NoOfBedrooms,rent);
            exc[i] = new AppartmantException(Address,Number,NoOfBedrooms,rent);

        }



        scan.close();
    }
}
