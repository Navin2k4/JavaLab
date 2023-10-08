import java.util.*;
public class ThrowApartmentException {
   

    public static void main(String[] args) {
   
        String stradd="";
        int apartmentno=0;
        int bedno=0;
        double rent=0.00;
        ApartmentException[] apart=new ApartmentException[10];
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the No.of.Apartment Details Available:");
        int n=s.nextInt();
       
        for(int i=1;i<=n;i++)
        {
            apart[i]=new ApartmentException(stradd,apartmentno,bedno,rent);
            System.out.println("Enter the Details for Aparment "+i+"..");
            stradd=apart[i].getstradd();
            boolean errorfound=false;
            try{
            apartmentno=apart[i].getapartno();
            if(apartmentno<100&&apartmentno>999) throw new Apartment(" The Apartment Number Should be 3 Digits Only!");
            }
            catch(Exception e){
                System.out.println("ERROR:"+e.getMessage()+"\n");
                errorfound=true;
            }
            try{
            bedno=apart[i].getbedno();
            if(bedno<1&&bedno>4) throw new Apartment(" The Apartment Number Should be Between 1 and 4 Only!");
            }
            catch(Exception e){
                System.out.println("ERROR:"+e.getMessage()+"\n");
                errorfound=true;
            }
            try{
            rent=apart[i].getrent();
            if(rent<=500&&rent>=2500) throw new Apartment(" The Rent Amount Should be Between $500 and $2500 Only!");
            }
            catch(Exception e){
                System.out.println("ERROR:"+e.getMessage()+"\n");
                errorfound=true;
            }
            if(!errorfound) System.out.println("\n\n"+apart[i]);
        }
        s.close();
    }
}