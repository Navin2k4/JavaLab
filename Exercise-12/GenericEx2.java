public class GenericEx2 {
    public static <T extends Comparable<T>> T findMinimum(T[] array) {
        if (array == null || array.length == 0) {
            return null; 
        }
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 8, 1, 6};
        Integer minInteger = findMinimum(intArray);
        System.out.println("Minimum value in Integer array: " + minInteger);
        Double[] doubleArray = {3.2, 1.0, 5.5, 2.7, 4.1};
        Double minDouble = findMinimum(doubleArray);
        System.out.println("Minimum value in Double array: " + minDouble);
        String[] stringArray = {"apple", "orange", "banana", "grape", "kiwi"};
        String minString = findMinimum(stringArray);
        System.out.println("Minimum value in String array: " + minString);
    }
}
