public class Armstorng {
    public static void main(String[] args) {
     

        for(int num=100; num<=2000; num++){
            if(isArmstrong(num)){
                System.out.println(num);
            }
        }
        
    }


    static boolean isArmstrong(int num){
    int rem=0,sum=0,n=num;
    while(n>0){
        rem=n%10;
        sum  += rem*rem*rem;
        if(num==sum){
            return true;
        }
        n=n/10;
        
    }
   
        return false;
    }


    
}
