public class Sumofrow {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {2,3,4,5},
            {3,4,5,3}
        };
        System.out.println(maxRowsum(arr));
    }

    static int maxRowsum(int[][] num){
    int max=0;
    for(int i=0; i<num.length; i++){
        for(int j=0; j<num.length; j++){
            int sum=0;
            sum += num[i][j];
            if(sum>max){
                max=sum;
            }
        }

    }



        return max;
    }
}
