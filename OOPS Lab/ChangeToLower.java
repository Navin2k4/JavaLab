import java.io.*;
public class ChangeToLower {
    public static void main(String[] args) throws Exception {
        File file = new File("upper.txt");
        if(!file.exists()){
            file.createNewFile();
            System.out.println("FileCreated successfully");
        }

        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileWriter fw = new FileWriter("lower.txt",true);
        
        int i;
        while((i=bis.read())!=-1){
            char ch =(char)i;
            System.out.print(ch);
            fw.write(Character.toLowerCase(ch)+"");
            fw.flush();
        }
        
        fw.close();
        bis.close();
        FileReader fr = new FileReader("lower.txt");
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }
        fr.close();
    }
}