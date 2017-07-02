import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int ref[]=new int[26];
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)))
                ref[Character.getNumericValue(s.charAt(i))-10]++;
        }
        int count=0;
        for(int i=0;i<ref.length;i++)
            if(ref[i]!=0) count++;
        System.out.println((count==26)?"pangram":"not pangram");
    }
}
