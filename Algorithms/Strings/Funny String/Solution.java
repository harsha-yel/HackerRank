import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String funnyString(String s){
        // Complete this function
        boolean flag=true;
        StringBuilder sb=new StringBuilder(s);
        sb=sb.reverse();
        String s1=sb.toString();
        char ch[]=s.toCharArray();
        char ch1[]=s1.toCharArray();
        for(int i=1;i<s.length();i++){
            int diff1=Math.abs(Character.getNumericValue(ch[i])-Character.getNumericValue(ch[i-1]));
            int diff2=Math.abs(Character.getNumericValue(ch1[i])-Character.getNumericValue(ch1[i-1]));
            if(diff1!=diff2){flag=false;break;  }
    }
        return flag?"Funny":"Not Funny";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
