import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(); //5
        in.close();
        fun(n); //0, 1, 1, 2, 3
    }
    static void fun(int n){
        int a=0, b=1, c;
        for(int i=0; i<n; i++){
           System.out.println(a+" ");
           c=a+b;
           a=b;
           b=c;
        }
    }
}
