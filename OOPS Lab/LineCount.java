import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {
    public int count(String filename) throws IOException{
        int linecount = 0;
        FileReader fr =  new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        while(br.readLine()!=null){
            linecount++;
        }
        br.close();
        fr.close();
        return linecount;
        
    }
    public static void main(String[] args) throws IOException {
        LineCount lc = new LineCount();
        for(String arg : args){
            System.out.println("Number of line in "+arg+" is "+lc.count(arg));
        }
    }
}
