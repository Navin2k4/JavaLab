import java.util.Scanner;
class Generic<T> {
    T[] array;
    Generic(T[] array) {
        this.array = array;
    }
    void addAtBeginning(T value) {
        T[] newArray = (T[]) new Object[array.length + 1];
        newArray[0] = value;
        System.arraycopy(array, 0, newArray, 1, array.length);
        array = newArray;
    }
    void addAtMiddle(T value) {
        T[] newArray = (T[]) new Object[array.length + 1];
        int mid = array.length / 2;
        System.arraycopy(array, 0, newArray, 0, mid);
        newArray[mid] = value;
        System.arraycopy(array, mid, newArray, mid + 1, array.length - mid);
        array = newArray;
    }
    void addAtLast(T value) {
        T[] newArray = (T[]) new Object[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = value;
        array = newArray;
    }
    void deleteElement(int index) {
        if (index >= 0 && index < array.length) {
            T[] newArray = (T[]) new Object[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
            array = newArray;
        } else {
            System.out.println("Invalid index for deleting element.");
        }
    }
    void displayArray() {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
public class GenericEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        Integer[] numbers = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        Generic<Integer> genericObject = new Generic<>(numbers);
        int choice;
            System.out.println("\nMenu:");
            System.out.println("1. Add at the beginning");
            System.out.println("2. Add in the middle");
            System.out.println("3. Add at the end");
            System.out.println("4. Delete element");
            System.out.println("5. Display array");
            System.out.println("0. Exit");
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to add at the beginning: ");
                    int valueAtBeginning = scanner.nextInt();
                    genericObject.addAtBeginning(valueAtBeginning);
                    System.out.print("Array after adding at the beginning: ");
                    genericObject.displayArray();
                    break;
                case 2:
                    System.out.print("Enter value to add in the middle: ");
                    int valueAtMiddle = scanner.nextInt();
                    genericObject.addAtMiddle(valueAtMiddle);
                    System.out.print("Array after adding in the middle: ");
                    genericObject.displayArray();
                    break;
                case 3:
                    System.out.print("Enter value to add at the end: ");
                    int valueAtEnd = scanner.nextInt();
                    genericObject.addAtLast(valueAtEnd);
                    System.out.print("Array after adding at the end: ");
                    genericObject.displayArray();
                    break;
                case 4:
                    System.out.print("Enter index to delete an element: ");
                    int deleteIndex = scanner.nextInt();
                    genericObject.deleteElement(deleteIndex);
                    System.out.print("Array after deleting element at index " + deleteIndex + ": ");
                    genericObject.displayArray();
                    break;
                case 5:
                    System.out.print("Current Array: ");
                    genericObject.displayArray();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

