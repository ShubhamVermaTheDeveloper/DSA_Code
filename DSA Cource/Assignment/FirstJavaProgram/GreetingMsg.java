import java.util.Scanner;

public class GreetingMsg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name=in.nextLine();
        in.close();
        System.out.println("Hello "+name+" Welcome to the DSA Course\n Thanku");

    }
}
