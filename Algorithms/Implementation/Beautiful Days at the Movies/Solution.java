import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int isbeautiful(int i, int n){
        int original=i;
        int res=0,rem=0;
        while(i>0){
            rem=i%10;
            res=res*10+rem;
            i=i/10;
        }
       // System.out.println(res);
        int diff=(int)Math.abs(original-res);
      //  System.out.println(diff/(double)n);
      //  System.out.println(diff+" "+(int)Math.ceil(diff/n)+" "+(int)(diff/n));
        if((int)(Math.ceil(diff/(double)n))==(diff/n)){ return 1;}
        else {return 0;}
    }
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        int j=in.nextInt();
        int n=in.nextInt();
        int count=0;
        while(i<=j)
        {
            if(isbeautiful(i,n)==1) count++;
            i++;
        } 
        System.out.println(count);
    }
}