import java.io.*;
public class CharacterByteStreams {
    public static void main(String[] args) {
        try {
            FileReader inputFile = new FileReader("input2.txt");
            FileWriter outputFile = new FileWriter("output2.txt");
            int character;
            while ((character = inputFile.read()) != -1) {
                outputFile.write(character);
            }
            inputFile.close();
            outputFile.close();
            FileInputStream inputStream = new FileInputStream("binaryInput.dat");
            FileOutputStream outputStream = new FileOutputStream("binaryOutput.dat");

            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }

            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}