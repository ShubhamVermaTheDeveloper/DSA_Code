import java.util.*;

public class InfiniteNumSUm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        int n;
        char x=00;
        int sum=0;
        while(true){
         n=in.nextInt();
         sum += n; 
         
         if(n==x)
         {
            System.out.println(sum);
            break;
         }
        }
       
    }
}



