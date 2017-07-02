import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int aInv[]=new int[n+1];
        int px=0;
        for(int i=1;i<=n;i++)
        {
            px=sc.nextInt();
            aInv[px]=i;
        }
        for(int i=1;i<=n;i++){
           System.out.println(aInv[aInv[i]]);
        }   
    }
}
