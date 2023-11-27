
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class countmethod{
    public void countword(String filename) throws IOException{
        FileInputStream fis =  new FileInputStream(filename);
        BufferedInputStream bis = new BufferedInputStream(fis);
        int count=0;
        int i;
        String str="";
        String[] strarr={};
        while((i=bis.read())!=-1){
            str+=(char)i;
        }
        strarr=str.split(" ");
        count = strarr.length;
        System.out.println("Number of Words in "+filename +" is "+ count);        
    }
}

public class WordCount extends Thread {
    public String filename;
    WordCount(String filename){
        this.filename = filename;
    }
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide three file names as arguments.");
            return;
        }

        WordCount file1 = new WordCount(args[0]);
        WordCount file2 = new WordCount(args[1]);
        WordCount file3 = new WordCount(args[2]);
        file1.start();
        file2.start();
        file3.start();
    }
    public void run(){
        System.out.println("Thread : " + filename + " is Running");
        countmethod obj = new countmethod();
        try {
            obj.countword(filename);
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
