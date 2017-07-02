import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int anagram(String s){
        // Complete this function
        int a1[]=new int[26];
        int a2[]=new int[26];
        if(s.length()%2!=0) return -1;
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2);
        StringBuilder sb=new StringBuilder(s1);
        if(s.length()%2!=0) return -1;
        for(int i=0;i<s2.length();i++){
            int j=(new String(sb)).indexOf(s2.charAt(i));
            if(j>=0) sb.delete(j,j+1);

        }
        
        return sb.length();
     }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}
