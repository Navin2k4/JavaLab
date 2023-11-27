import java.util.Scanner;
public class StudentGrading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 5 marks: ");
        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        int m3 = scan.nextInt();
        int m4 = scan.nextInt();
        int m5 = scan.nextInt();
        int tot = m1 + m2 + m3 + m4 + m5;
        int total = tot / 5;
        if (total >= 91 && total <= 100) {
            System.out.println("Outstanding Grade 10");
        } else if (total >= 81 && total <= 90) {
            System.out.println("Excellent Grade 9");
        } else if (total >= 71 && total <= 80) { // Modified condition
            System.out.println("Very Good Grade 8");
        } else if (total >= 61 && total <= 70) {
            System.out.println("Good Grade 7");
        } else if (total >= 51 && total <= 60) { // Modified condition
            System.out.println("Average Grade 6");
        } else if (total <= 50) { // Modified condition
            System.out.println("RA Grade 0");
        } else {
            System.out.print("Invalid Entry"); // Corrected spelling
        }
        scan.close();
    }
}