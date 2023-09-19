import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Doctor D1 = null;  // Initialize D1 to avoid compilation error

        try {
            System.out.print("Enter ID         : ");
            int id = scan.nextInt();

            System.out.print("Enter Name       : ");
            String name = scan.next();

            if (!name.matches("[a-zA-Z]+")) {
                throw new NameNotValidException("Name is not valid");
            }

            System.out.print("Enter Age        : ");
            int age = scan.nextInt();

            if (age < 25 || age > 65) {
                throw new AgeNotWithinRange("Age is not within range");
            }

            System.out.print("Enter Department : ");
            String department = scan.next();

            D1 = new Doctor(id, name, age, department);
        } 
        catch (AgeNotWithinRange e) {
            System.out.println(e.getMessage());
        } 
        catch (NameNotValidException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            if (D1 != null) {
                System.out.println(D1.toString());
            }
        }
    }
}

class AgeNotWithinRange extends Exception {
    public AgeNotWithinRange(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Doctor {
    int id, age;
    String name, department;

    Doctor(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Doctor Information: " +
                "\nID: " + id +
                "\nName: " + name +
                "\nAge: " + age +
                "\nDepartment: " + department;
    }
}
