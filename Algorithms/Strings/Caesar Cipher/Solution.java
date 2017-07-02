import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
            if(Character.isLetter(ch[i]))
            {
                int base=Character.isLowerCase(ch[i])?'a':'A';
                ch[i]=(char)((ch[i]+k-base)%26+base);
            }     
                
        System.out.println( new String(ch));
    }
}
