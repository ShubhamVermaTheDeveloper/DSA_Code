//Take a number as input and print the multiplication table for it.
import java.util.Scanner;
public class MultipliTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();  //5
        for(int i=1; i<=10; i++)
        System.out.println(n*i);
    }
    
}
