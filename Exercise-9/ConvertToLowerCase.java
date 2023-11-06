import java.io.*;
public class ConvertToLowerCase {
    public static void main(String[] args) {
        try {
            FileReader inputFile = new FileReader("input1.txt");
            BufferedReader bufferedReader = new BufferedReader(inputFile);
            FileWriter outputFile = new FileWriter("output1.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(outputFile);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
 bufferedWriter.write(word.toLowerCase() + " ");
                }
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

