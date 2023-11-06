import java.io.File;
public class FileInfo {
    public static void main(String[] args) {
        String fileName = "example.txt";
        File file = new File(fileName);
        System.out.println("File exists: " + file.exists());
        System.out.println("File is readable: " + file.canRead());
        System.out.println("File is writable: " + file.canWrite());
        System.out.println("File type: " + (file.isFile() ? "Regular File" : "Directory"));
        System.out.println("File length (in bytes): " + file.length());
    }
}