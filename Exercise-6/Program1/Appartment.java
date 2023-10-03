package Exercise6.Program1;

public class Appartment {
    String address;
    int number, noofbed, rent;
    Appartment(String address,int number,int noofbed,int rent){
        address = this.address;
        number = this.number;
        noofbed = this.noofbed;
        rent = this.rent;
    }
    public String toString(){
        return "Address : "+address+
                "Number : "+number+
                "No.Bed : "+noofbed+
                "Rent : "+rent;
    }
}

