import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        char ch=in.next().charAt(0);
        in.close();
        if(ch=='+'){
            System.out.println(a+b);
        }
        if(ch=='-'){
            System.out.println(a-b);
        }
        if(ch=='*'){
            System.out.println(a*b);
        }
        if(ch=='/'){
            System.out.println((float)a/b);
        }
    }
}
