//To find out whether the given String is Palindrome or not.

import java.lang.String;

public class StringPalindrom {
    public static void main(String[] args) {
      String str="aaaaaaaabbbbbbbbaaaaaaaa";  //abcdabcd/abcd/aabb/ccass
      System.out.println(isPalindrom(str));  //ture or false
      
    }

    static boolean isPalindrom(String str){
        int left=0, right=str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
            
        }
        return true;
    }
}
