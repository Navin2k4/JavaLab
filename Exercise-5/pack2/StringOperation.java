
package pack2;

public class StringOperation {
    String CatStr,RevStr="";
    public String concatenate(String a,String b){
        CatStr = a+" "+b;
        return CatStr;
    }
    public String reverse(String str){
        char ch[] = str.toCharArray();
        int strlen = str.length();
        for(int i=strlen-1;i>=0;i--){
            RevStr=RevStr+ch[i];
        }
        return RevStr;
    }
}
