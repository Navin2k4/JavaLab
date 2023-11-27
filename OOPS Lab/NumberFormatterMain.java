import java.io.*;
import java.util.Scanner;
class NumberFormatter {
    String phno;
    String modifiedphno="";
    public void modify(String phone) throws IOException{
        this.phno = phone;
        modifiedphno+='(';
        modifiedphno+=phone.substring(0, 3);
        modifiedphno+=") ";
        modifiedphno+=phone.substring(4, 7);
        modifiedphno+="-";
        modifiedphno+=phone.substring(7);
        savetoFile(modifiedphno);
        System.out.println("Phone : "+ phno +" Modified to : "+ modifiedphno +"\n");
        modifiedphno="";
    }
    public void savetoFile(String modifiedphone) throws IOException{
        FileWriter fw = new FileWriter("PhoneNumberFormat.java");
        fw.write(modifiedphone);
        fw.flush();
        fw.close();
    }
}

public class NumberFormatterMain{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        NumberFormatter obj = new NumberFormatter();
        String phone;
        do {
            System.out.print("Enter the phone number (999 to EXIT) : ");
            phone = scan.next();
            if (phone.equals("999"))
                break;
            if (phone.length() > 10) {
                System.out.println("Invalid phone number length. Please enter a valid number.");
                continue;
            }
            obj.modify(phone);
        } while (true);

    scan.close();
    }
}