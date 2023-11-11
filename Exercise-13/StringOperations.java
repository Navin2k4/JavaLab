import java.util.ArrayList;
import java.util.Scanner;
class StringOperations {
    private ArrayList<String> stringList;
    public StringOperations() {
        this.stringList = new ArrayList<>();
    }
    public void append(String str) {
        stringList.add(str);
    }
    public void insert(int index, String str) {
        if (index >= 0 && index <= stringList.size()) {
            stringList.add(index, str);
        } else {
            System.out.println("Invalid index for insertion.");
        }
    }
    public int search(String str) {
        return stringList.indexOf(str);
    }
    public ArrayList<String> listStartsWith(char letter) {
        ArrayList<String> resultList = new ArrayList<>();
        for (String str : stringList) {
            if (str.charAt(0) == letter) {
                resultList.add(str);
            }
        }
        return resultList;
    }
    public void displayList() {
        System.out.println("String List:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringOperations stringOps = new StringOperations();
        stringOps.append("Apple");
        stringOps.append("Banana");
        stringOps.insert(1, "Orange");
        stringOps.displayList();

        System.out.println("Enter a string to search: ");
        String searchString = scanner.next();
        int searchResult = stringOps.search(searchString);
        if (searchResult != -1) {
            System.out.println("String found at index: " + searchResult);
        } else {
            System.out.println("String not found.");
        }
        System.out.println("Enter a letter to list strings starting with that letter: ");
        char startLetter = scanner.next().charAt(0);
        ArrayList<String> startsWithList = stringOps.listStartsWith(startLetter);
        System.out.println("Strings starting with '" + startLetter + "': " + startsWithList);
        scanner.close();
    }
}
