import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class Largestnum {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int a=in.nextInt();     //10
        int b=in.nextInt();     //20
        System.out.println(fun(a,b));    //20
        
    }
    
    static int fun(int a, int b){
        if(a>b) return a;
        else return b;

      
    }
}
