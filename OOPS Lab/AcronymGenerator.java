import java.util.Scanner;

public class AcronymGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three words:");
        String str = scan.nextLine();
        String[] strarr = str.split(" ");
        if(strarr.length>3){
            System.out.println("Enter string with 3 letters");
        }
        String result = "";
        for(String x : strarr){
            char ch;
            ch = x.charAt(0);
            result += Character.toUpperCase(ch);
        }
        System.out.println(result);
    }
}
