import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String twoStrings(String s1, String s2){
        // Complete this function
        int ch1[]=new int[26];
        int ch2[]=new int[26];
        for(int i=0;i<s1.length();i++) ch1[s1.charAt(i)-'a']++;
        for(int i=0;i<s2.length();i++) ch2[s2.charAt(i)-'a']++;
        for(int i=0;i<26;i++){
            if((ch1[i]!=0)&&(ch2[i]!=0)) return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}
