import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean isPalindrome(String out){
        StringBuilder sb=new StringBuilder(out);
        if(out.equals(String.valueOf(sb.reverse()))) return true;
        else return false;
        
    }
    static int palindromeIndex(String s){
        // Complete this function
        if(isPalindrome(s)) return -1;
        else{
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=s.charAt(s.length()-1-i))
                {    
                    String sNew=s.substring(0,i)+s.substring(i+1);
                    if(isPalindrome(sNew)) return i;
                    else return s.length()-1-i;
                }
            }
                
        return -2;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}
