//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Evenodd{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();    //5 or 2 etc
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}