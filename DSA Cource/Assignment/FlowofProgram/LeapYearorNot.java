//Input a year and find whether it is a leap year or not.
import java.util.Scanner;

class LeapYearorNot{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        /*  int year = in.nextInt();
        if(year%4==0 | year%100==0 | year%400==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }*/

     for(int year=2000; year<=2050; year++)
        if(year%4==0 | year%100==0 | year%400==0){
            System.out.print(year+" ");
        }
        

    }
}