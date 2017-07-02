import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String gameOfThrones(String s){
        // Complete this function
        int ch[]=new int[26];
        for(int i=0;i<s.length();i++)
            ch[s.charAt(i)-'a']++;
        int count=0;
        for(int i=0;i<26;i++){
            if(ch[i]%2!=0) count++;
        }
        return (count>1)?"NO":"YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
