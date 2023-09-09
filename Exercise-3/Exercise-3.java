
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        int number_of_persons,yr;
        String S_name,S_add,prg,scl;
        double fe,pa;
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the number of Persons : ");
        number_of_persons= scan.nextInt();

        Person[] newPerson = new Person[number_of_persons];
        Student[] newStudent = new Student[number_of_persons];
        Staff[] newStaff = new Staff[number_of_persons];

        for (int i = 0; i < number_of_persons; i++) {
            int choice;
            System.out.println("1.Student\n2.Staff");
            System.out.print("Enter the Person type :");
            choice= scan.nextInt();

            newPerson[i] = new Person("", "");
            newStudent[i] = new Student("", "", "", 0, 0.0);
            newStaff[i] = new Staff("", "", "", 0.0);

            switch (choice){
                case 1:
                    S_name = newPerson[i].getName();
                    S_add  = newPerson[i].getAddress();
                    prg = newStudent[i].getProgram();
                    yr  = newStudent[i].getYear();
                    fe =newStudent[i].getFee();
                    newStudent[i] = new Student(S_name,S_add,prg,yr,fe);
                    System.out.println(newStudent[i]);
                    System.out.println("1 to Continue || Enter 0 to update");
                    int select = scan.nextInt();
                    if (select==0) {
                        System.out.print("To Set\n1.Program\n2.Year\n3.Fee\n");
                        int choice2 = scan.nextInt();
                        switch (choice2) {
                            case 1:
                                System.out.println("Enter the program to update : ");
                                String NewProgram = scan.nextLine();
                                newStudent[i].setProgram(NewProgram);
                                System.out.println(newStudent[i]);
                                break;
                            case 2:
                                System.out.println("Enter the Year to update : ");
                                int NewYear = scan.nextInt();
                                newStudent[i].setYear(NewYear);
                                System.out.println(newStudent[i]);
                                break;
                            case 3:
                                System.out.println("Enter the Fee to update : ");
                                double NewFee = scan.nextDouble();
                                newStudent[i].setFee(NewFee);
                                System.out.println(newStudent[i]);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    S_name = newPerson[i].getName();
                    S_add  = newPerson[i].getAddress();
                    scl = newStaff[i].getSchool();
                    pa =newStaff[i].getPay();
                    newStaff[i] = new Staff(S_name,S_add,scl,pa);
                    System.out.println(newStaff[i]);
                    System.out.println("1 to Continue || Enter 0 to update");
                    select = scan.nextInt();
                    if (select==0) {
                        System.out.print("To Set\n1.School\n2.Pay\n");
                        int choice2 = scan.nextInt();
                        switch (choice2) {
                            case 1:
                                System.out.println("Enter the School to update : ");
                                String NewSchool = scan.nextLine();
                                newStaff[i].setSchool(NewSchool);
                                System.out.println(newStaff[i]);
                                break;
                            case 2:
                                System.out.println("Enter the Pay to update : ");
                                int NewPay = scan.nextInt();
                                newStaff[i].setPay(NewPay);
                                System.out.println(newStaff[i]);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }

    }
}
class Person{
    Scanner obj = new Scanner(System.in);
    String name;
    String address;
    public Person(String name,String address){
        this.name=name;
        this.address=address;
    }
    String getName(){
        System.out.print("Enter Name : ");
        name = obj.nextLine();
        return name;
    }
    String getAddress(){
        System.out.print("Enter Address : ");
        address = obj.nextLine();
        return address ;
    }
}

class Student extends Person{
    String program;
    int year;
    double fee;
    Student(String name,String address,String program,int year,double fee){
        super(name, address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }
    String getProgram(){
        System.out.print("Enter the Program : ");
        program = obj.nextLine();
        return program;
    }
    void setProgram(String prg){
        this.program=prg;
    }
    int getYear(){
        System.out.print("Enter the Year : ");
        year = obj.nextInt();
        return year;
    }
    void setYear(int yr){
        this.year =yr;
    }
    double getFee(){
        System.out.print("Enter the Fees : ");
        fee = obj.nextDouble();
        return fee;
    }
    void setFee(double fe){
        this.fee=fe;
    }
    @Override
    public String toString() {
        return "Name : "+name+"\nAddress : "+address+"\nProgram : "+program+"\nYears : "+year+"\nFees : "+fee;
    }
}
class Staff extends Person{
    String school;
    double pay;
    Staff(String name,String address,String school,double pay){
        super(name, address);
        this.school=school;
        this.pay=pay;
    }
    String getSchool(){
        System.out.print("Enter the School Name : ");
        school = obj.nextLine();
        return school;
    }
    double getPay(){
        System.out.print("Enter the Basic Pay : ");
        pay = obj.nextDouble();
        return pay;
    }
    void setSchool(String scl){
        this.school=scl;
    }
    void setPay(double pa){
        this.pay=pa;
    }
    @Override
    public String toString() {
        return "Name : "+name+"\nAddress : "+address+"\nSchool : "+school+"\nPay : "+pay;
    }
}