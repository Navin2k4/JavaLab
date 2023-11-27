
// Next, create an array of customer objects and execute the following actions:

// Pay Balance
// Change Pin

import java.util.Scanner;

interface CreditCardInterface{
    double viewCreditAmount();
    int viewPin();
    void changePin(int newpin);
    void payBalance(double amount);
}

public class Customer implements CreditCardInterface {
    private String name;
    private int cardNumber,pin;
    private double creditAmount ;

    Customer(String name,int cardNumber,int pin,double creditAmount){
        this.name = name;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.creditAmount = creditAmount;
    }
    public double viewCreditAmount(){
        return creditAmount;
    }
    public int viewPin(){
        return pin;
    }
    public void changePin(int newpin){
        this.pin = newpin;
        System.out.println("Pin changes Successfully : " + pin);
    }
    public void payBalance(double amount){
        if(amount<= creditAmount){
            creditAmount -= amount;
            System.out.println("Payment successful. Updated balance: " + creditAmount);
        } else {
            System.out.println("Insufficient balance to make this payment.");
        }
    }
    public void displaydata(){
        System.out.println("Name: " + name);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Pin: " + pin);
        System.out.println("Credit Amount: " + creditAmount);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of customers : "); 
        int nc = scan.nextInt();
        Customer[] obj = new Customer[nc];
        for (int i = 0; i < nc; i++) {
            System.out.println("Enter details for customer "+(i+1));
            System.out.print("Name : ");
            String name = scan.next();
            System.out.print("Cardnumber : ");
            int cardno = scan.nextInt();
            System.out.print("Pin : ");
            int pin = scan.nextInt();
            System.out.print("Credit Amount : ");
            double ca = scan.nextDouble();
            obj[i] = new Customer(name, cardno, pin,ca);
        }
        System.out.println("");
        for (int i = 0; i < nc; i++) {
            obj[i].displaydata();
        }
        obj[0].changePin(210);
        obj[0].payBalance(1000);
        scan.close();
    }
}
