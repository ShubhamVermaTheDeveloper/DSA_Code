//{ Driver Code Starts
// Initial Template for Java

import java.io.*;


class sumdigitpalindrom {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
       int rem=0,sum=0;
       while(N>0){
           rem= N%10;
           sum += rem;
           N = N/10;
       }
       
       /*int ans=0, num=sum;
       while(sum>0){
           rem= sum%10;
           ans = ans*10 + rem;
           sum = sum/10;
       }
       if(num==ans){
           return 1;
       }*/
       
       if(sum<10) return 1;
           else if(sum % 11 == 0) return 1;
       
       return 0;
       
    }
}