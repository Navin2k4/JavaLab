
//Program 2
import java.util.Scanner;

class Library {
    private int totalBooks;

    public Library(int totalBooks) {
        this.totalBooks = totalBooks;
    }

    public synchronized void checkOutBook(String user, int booksToCheckOut) {
        if (booksToCheckOut > totalBooks) {
            System.out.println("\n"+user + " cannot check out " + booksToCheckOut + " books. Not enough books available.");
            return;
        }

        totalBooks -= booksToCheckOut;
        System.out.println("\n"+user + " checked out " + booksToCheckOut + " book(s). Total books available: " + totalBooks);
    }

    public synchronized void returnBook(String user, int booksToReturn) {
        totalBooks += booksToReturn;
        System.out.println("\n"+user + " returned " + booksToReturn + " book(s). Total books available: " + totalBooks);
    }
}

class LibraryUser extends Thread {
    private final Library library;
    private final String name;
    private final int booksToCheckOut;
    private final int booksToReturn;

    public LibraryUser(Library library, String name, int booksToCheckOut, int booksToReturn) {
        this.library = library;
        this.name = name;
        this.booksToCheckOut = booksToCheckOut;
        this.booksToReturn = booksToReturn;
    }

    @Override
    public void run() {
        library.checkOutBook(name, booksToCheckOut);

        try {
            Thread.sleep(200); // Simulate reading books
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        library.returnBook(name, booksToReturn);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of books in the library: ");
        int totalBooks = scanner.nextInt();

        System.out.print("Enter the total number of library users: ");
        int totalUsers = scanner.nextInt();

        Library library = new Library(totalBooks);

        for (int i = 1; i <= totalUsers; i++) {
            System.out.print("Enter the number of books to check out for User " + i + ": ");
            int booksToCheckOut = scanner.nextInt();

            System.out.print("Enter the number of books to return for User " + i + ": ");
            int booksToReturn = scanner.nextInt();

            LibraryUser user = new LibraryUser(library, "User " + i, booksToCheckOut, booksToReturn);
            user.start();
        }
    }
}