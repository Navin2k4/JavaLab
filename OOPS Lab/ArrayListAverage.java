import java.util.ArrayList;
import java.util.Random;

public class ArrayListAverage {
    public static void main(String[] args) {
        int[] intarr = new int[20];
        Random random = new Random();
        int sum = 0;
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> belowaverage = new ArrayList<>();
        ArrayList<Integer> aboveaverage = new ArrayList<>();
        

        for (int i = 0; i < intarr.length; i++) {
            intarr[i] = random.nextInt(80) + 10;
            sum += intarr[i];
            array.add(intarr[i]);
        }

        double average = sum/intarr.length;

        for (int value : intarr){
            if(value<average){
                belowaverage.add(value);
            }
            else{
                aboveaverage.add(value);
            }

        }
        System.out.print("The Array is : ");
        System.out.println(array);
        System.out.println("The average is : "+average);
        System.out.print("Above average : ");
        System.out.println(aboveaverage);
        System.out.print("Below average : ");
        System.out.println(belowaverage);

    }
}

