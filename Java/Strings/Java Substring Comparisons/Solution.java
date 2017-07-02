import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int max_len=sc.nextInt();
        String smallest=str.substring(0,max_len);
        String largest=str.substring(0,max_len);
        for(int i=1;i<str.length()-max_len+1;i++)
        {
            if(str.substring(i,i+max_len).compareTo(smallest)<0)
                smallest=str.substring(i,i+max_len);
            if(str.substring(i,i+max_len).compareTo(largest)>0)
                largest=str.substring(i,i+max_len);
            
        }    
        System.out.println(smallest);
        System.out.println(largest);
    }
}