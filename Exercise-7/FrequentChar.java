import java.util.Scanner;
public class FrequentChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String original_string = scan.nextLine();
        char original_array[] = original_string.toCharArray();
        char repeated_char[] = new char[original_array.length]  ;
        int repeated_count[] = new int[original_array.length];
        int count = 0;
        for (int i = 0; i < original_array.length; i++) {
            char target = original_array[i];
            boolean containsChar = false;
            for (int j = 0; j < count; j++) {
                if (repeated_char[j] == target) {
                    containsChar = true;
                    repeated_count[j]++;
                    break;
                }
            }
            if (!containsChar) {
                repeated_char[count] = target;
                repeated_count[count] = 1;
                count++;
            }
        }
        int max = repeated_count[0];
        int secondMax = 0;
        int maxIndex = 0;
        int secondMaxIndex = -1;
        for (int i = 1; i < count; i++) {
            if (repeated_count[i] > max) {
                secondMax = max;
                secondMaxIndex = maxIndex;
                max = repeated_count[i];
                maxIndex = i;
            } 
            else if (repeated_count[i] > secondMax && repeated_count[i] != max) {
                secondMax = repeated_count[i];
                secondMaxIndex = i;
            }
        }
        System.out.println(
                "Character: " + repeated_char[secondMaxIndex] + " " +
                "Frequency: " + repeated_count[secondMaxIndex]);
        scan.close();
    }
}

//OUTPUT
// Enter the string : success
// Character: c Frequency: 2