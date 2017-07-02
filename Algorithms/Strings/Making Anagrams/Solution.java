import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int makingAnagrams(String s1, String s2){
        // Complete this function
        int count=0;
        StringBuilder sb=new StringBuilder(s1);
        for(int i=0;i<s2.length();i++){
            int j=(new String(sb)).indexOf(s2.charAt(i));
            if(j>=0) {count++;sb.delete(j,j+1);}
            
        }
        return s1.length()+s2.length()-2*count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
