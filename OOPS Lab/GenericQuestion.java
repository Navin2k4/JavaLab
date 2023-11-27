// Write java programs that include generic method to satisfy the following property.
// a.	To counts the number of odd integers in an integer list
// b.	To exchange the positions of two different elements in an array.
// c.	To find the maximal element in the range [begin, end] of a list.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Gen{
    public <T extends Number> int countOddNumbers(List<T> list){
        int count = 0 ;
        for(T ele:list){
                int num = ((Integer) ele).intValue();
                if(num%2!=0){
                    count++;
            }
        }
        return count;
    }

    public <T> void exchangeElements(T[] arr, int index1, int index2) {
            T temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
    }

    public <T extends Comparable<T>> T findMaximalElement(T[] list, int begin, int end) {
            T max = list[begin];
            for (int i = begin + 1; i <= end; i++) {
                if (list[i].compareTo(max) > 0) {
                    max = list[i];
                }
            }
            return max;
    }

}
public class GenericQuestion{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Gen obj = new Gen();
        Random random = new Random();

        for(int i=0;i<10;i++){
            int randomnumber = random.nextInt(100);
            list.add(randomnumber);
        }   
        Integer[] arr = { 1, 2, 3, 4, 5,6,7,8,9,2,323,2,53,53 }; // Example array

        System.out.println(list);
        int oddcount = obj.countOddNumbers(list);
        System.out.println("Odd integer count : " + oddcount);

        obj.exchangeElements(arr, 0, 4);
        System.out.println("Array after exchange: " + Arrays.toString(arr));

        Integer maximalElement = obj.findMaximalElement(arr, 2, 6);
        System.out.println("Maximal element in range: " + maximalElement);
    }
}