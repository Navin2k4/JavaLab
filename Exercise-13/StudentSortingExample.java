import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student {
    private String name;
    private int rollNo;
    private double cgpa;
    public Student(String name, int rollNo, double cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }
    public int getRollNo() {
        return rollNo;
    }
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", CGPA: " + cgpa;
    }
}
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollNo(), s2.getRollNo());
    }
}
public class StudentSortingExample {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("AAA", 101, 3.5));
        studentList.add(new Student("BBB", 102, 3.8));
        studentList.add(new Student("CCC", 103, 3.2));
        studentList.add(new Student("EEE", 104, 3.9));
        Collections.sort(studentList, new StudentComparator());
        System.out.println("Sorted Student List based on Roll No:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
