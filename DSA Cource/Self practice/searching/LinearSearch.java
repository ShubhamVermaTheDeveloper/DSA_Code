//Program for Linear search
//import java.util.Scanner;

public class LinearSearch{
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index=-1;
        int n=in.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }

        System.out.println("Enter the search value :");
        int search=in.nextInt();
        in.close();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==search){
                index=i;
                break;
            }
        }

        if(index==-1){
            System.out.println("Item not found");
        }
        else{
        System.out.println("Item present on the index "+index);
        }*/







        //using funtion linear search
        public static void main(String[] args) {
            int[] arr = {10,20,30,40,50,60,70,80,90,100};
            int target=70;
            System.out.println(linear(arr,target));
            

        }


        static int linear(int[] arr, int target){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==target){
                    return i;
                }
            }
            return -1;
        }




    
}