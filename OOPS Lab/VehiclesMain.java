// Define an abstract class “car” with members reg_no, model, reg_date. 
// Define two subclasses of this class – “transportVehicles ” 
// (validity_no, start_date, period) and “privateVehicle ” (owner_name, owner_address). 
// Define appropriate constructors. Create n objects which could be of 
// either transportVehicles or privateVehicle class by asking the user’s choice. 
// Display details of all “privateVehicle” objects and all “transportVehicles” objects.
import java.util.Scanner;

abstract class Car {
    String regNo;
    String model;
    String regDate;

    Car(String regNo, String model, String regDate) {
        this.regNo = regNo;
        this.model = model;
        this.regDate = regDate;
    }

    abstract void displayDetails();
}

class TransportVehicle extends Car {
    String validityNo;
    String startDate;
    int period;

    TransportVehicle(String regNo, String model, String regDate, String validityNo, String startDate, int period) {
        super(regNo, model, regDate);
        this.validityNo = validityNo;
        this.startDate = startDate;
        this.period = period;
    }
    void displayDetails() {
        System.out.println("Transport Vehicle Details:");
        System.out.println("Registration Number: " + regNo);
        System.out.println("Model: " + model);
        System.out.println("Registration Date: " + regDate);
        System.out.println("Validity Number: " + validityNo);
        System.out.println("Start Date: " + startDate);
        System.out.println("Period: " + period + " years\n");
    }
}

class PrivateVehicle extends Car {
    String ownerName;
    String ownerAddress;

    PrivateVehicle(String regNo, String model, String regDate, String ownerName, String ownerAddress) {
        super(regNo, model, regDate);
        this.ownerName = ownerName;
        this.ownerAddress = ownerAddress;
    }

    void displayDetails() {
        System.out.println("Private Vehicle Details:");
        System.out.println("Registration Number: " + regNo);
        System.out.println("Model: " + model);
        System.out.println("Registration Date: " + regDate);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Owner Address: " + ownerAddress + "\n");
    }
}

public class VehiclesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vehicles to create: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Choose vehicle type for vehicle " + (i + 1) + ":");
            System.out.println("1. Transport Vehicle");
            System.out.println("2. Private Vehicle");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.println("Enter details for Transport Vehicle:");
                System.out.print("Reg. No: ");
                String regNo = scanner.nextLine();
                System.out.print("Model: ");
                String model = scanner.nextLine();
                System.out.print("Reg. Date: ");
                String regDate = scanner.nextLine();
                System.out.print("Validity No: ");
                String validityNo = scanner.nextLine();
                System.out.print("Start Date: ");
                String startDate = scanner.nextLine();
                System.out.print("Period: ");
                int period = scanner.nextInt();
                scanner.nextLine(); 

                Car transportVehicle = new TransportVehicle(regNo, model, regDate, validityNo, startDate, period);
                transportVehicle.displayDetails();
            } else if (choice == 2) {
                System.out.println("Enter details for Private Vehicle:");
                System.out.print("Reg. No: ");
                String regNo = scanner.nextLine();
                System.out.print("Model: ");
                String model = scanner.nextLine();
                System.out.print("Reg. Date: ");
                String regDate = scanner.nextLine();
                System.out.print("Owner Name: ");
                String ownerName = scanner.nextLine();
                System.out.print("Owner Address: ");
                String ownerAddress = scanner.nextLine();
                Car privateVehicle = new PrivateVehicle(regNo, model, regDate, ownerName, ownerAddress);
                privateVehicle.displayDetails();
            }
        }
        scanner.close();
    }
}