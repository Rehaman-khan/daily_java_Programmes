public class leapYear_or_not {
    public static void main (String[]args){
        int year=2020;
        if(year%400==0){
            System.out.println(year+" "+ "is leap year");
        }
        if(year%4==0&&year%100!=0 ){
            System.out.println(year+" "+ "is leap year");
        }
        else {
            System.out.println("not a leap year");
        }
    }
}
