public class MonthToDays {
    public static void main(String[] args) {
        int months;
        int days=100;
        int remainingdays;
        months = days/30;
        remainingdays = days - (months*30);
        System.out.println(months +" Months "+remainingdays+" Days");
    }
}
