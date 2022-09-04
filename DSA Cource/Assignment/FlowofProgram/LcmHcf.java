import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args) {
        int temp, temp1, temp2, LCM, HCF;
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
       temp1=a;
       temp2=b;

       while(temp2 !=0){
        temp = temp2;
        temp2 = temp1%temp2;
        temp1 = temp;
     }
       HCF=temp1;
       LCM=(a*b)/HCF;
       System.out.println("Hcf is : "+ HCF);
       System.out.println("Lcm is :" +LCM);

    }
    
}
