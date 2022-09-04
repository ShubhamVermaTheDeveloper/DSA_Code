//Input currency in rupees and output in USD.
import java.util.Scanner;

public class RupeestoUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float currency= in.nextFloat();
        in.close();
        System.out.println(fun(currency));
    }
    
static double fun(float currency){
    return currency /79.50;
}

}
