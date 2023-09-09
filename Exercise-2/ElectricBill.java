import java.util.Scanner;
class Bill{
    int ConsumerNo;
    String ConsumerName;
    int prevMonthReading;
    int currMonthReading;
    String type;

    public Bill(int ConsumerNo,String ConsumerName, int prevMonthReading,int currMonthReading,String type){
        this.ConsumerNo   = ConsumerNo ;
        this.ConsumerName = ConsumerName ;
        this.prevMonthReading = prevMonthReading;
        this.currMonthReading = currMonthReading;
        this.type = type;
    }
    public double calculateBill(){
        int unitsConsumed = currMonthReading - prevMonthReading;
        double billAmount = 0;
        if(type.equalsIgnoreCase("domestic")){
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed;
            } else if ((unitsConsumed > 101 ) && (unitsConsumed <= 200)) {
                billAmount = 100 + (unitsConsumed - 100) * 2.5;
            } else if ((unitsConsumed > 201 ) && (unitsConsumed <= 500)) {
                billAmount = 100 + 100 * 2.5 + (unitsConsumed - 200) * 4;
            } else {
                billAmount = 100 + 100 * 2.5 + 300 * 4 + (unitsConsumed - 500) * 6;
            }
        }
        else if (type.equalsIgnoreCase("commercial")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 2;
            } else if ((unitsConsumed > 101 ) && (unitsConsumed <= 200)) {
                billAmount = 100 + (unitsConsumed - 100) * 4.5;
            } else if ((unitsConsumed > 201 ) && (unitsConsumed <= 500)) {
                billAmount = 100 + 100 * 4.5 + (unitsConsumed - 200) * 6;
            } else {
                billAmount = 100 + 100 * 4.5 + 300 * 6 + (unitsConsumed - 500) * 7;
            }
        }
        return billAmount;
    }


}
public class ElectricBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Costumers : ");
        int n = scan.nextInt();
        Bill[] newbill = new Bill[n];
        for (int i=0;i<n;i++) {
            System.out.print("Enter the Costumer Number : ");
            int C_No = scan.nextInt();
            System.out.print("Enter the name of the Costumer : ");
            String C_Name = scan.next();
            System.out.print("Enter previous month reading : ");
            int P_Amt = scan.nextInt();
            System.out.print("Enter this month reading : ");
            int C_Amt = scan.nextInt();
            System.out.print("Enter the type of consumer (domestic/commercial) : ");
            String type_Of_Consumer = scan.next();

            newbill[i] = new Bill(C_No,C_Name,P_Amt,C_Amt,type_Of_Consumer);
        }

        System.out.println();
        System.out.println("Electricity Bills : ");
        {
            for (int i = 0; i < n; i++) {
                double billAmount = newbill[i].calculateBill();
                System.out.println("Consumer " + (i + 1) + " - " + newbill[i].ConsumerName + ": Rs. " + billAmount);
            }
        }
    }
}
