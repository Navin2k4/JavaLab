import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range;
        System.out.println("Enter the range value : ");
        range = scan.nextInt();
        int i=1;
        while(i<=range){
            if((i%10) == 5){
                System.out.println(i+" ");
            }
            i++;
        }
        scan.close();
    }
}
