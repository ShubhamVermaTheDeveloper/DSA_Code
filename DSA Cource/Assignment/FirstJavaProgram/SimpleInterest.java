//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p,t,r;
       // float si;
        p=in.nextInt();
        t=in.nextInt();
        r=in.nextInt();
        System.out.println((float)(p*t*r)/100);

    }
}
