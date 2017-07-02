import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isValid(String s){
        // Complete this function
       int ch[]=new int[26];
        for(int i=0;i<s.length();i++) ch[s.charAt(i)-'a']++;
        Arrays.sort(ch);
        int i=0;
        for(i=0;i<26&&ch[i]==0;++i){}
        if(ch[i]==ch[25]) return "YES";
        if(ch[25]>ch[24]) return (ch[i]==ch[24]&&ch[25]-ch[24]==1)?"YES":"NO";
        return (ch[i] < ch[i+1] && ch[i+1] == ch[25] && ch[i] == 1)?"YES":"NO";
     //   System.out.println(Arrays.toString(ch));
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
