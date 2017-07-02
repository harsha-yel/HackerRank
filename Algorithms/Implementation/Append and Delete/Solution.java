import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        char ch_s[]=s.toCharArray();
        char ch_t[]=t.toCharArray();
        int len=0;
        for(int i=0;i<Math.min(ch_s.length,ch_t.length);i++)
            if(ch_s[i]==ch_t[i]) len++;
            else break;
        int s_toRemove=ch_s.length-len;
        int s_toAdd=ch_t.length-len;
        if(ch_s.length+ch_t.length-2*len>k) System.out.println("No");
        else if((ch_s.length+ch_t.length-2*len)%2==k%2) System.out.println("Yes");
        else if(ch_s.length+ch_t.length<k) System.out.println("Yes");
        else System.out.println("No");
    }
}
