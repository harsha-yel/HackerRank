import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int nearRoot(int n){
            BigInteger a=BigInteger.valueOf(n);
            if(n==0||n==1)
                return n;
            BigInteger start=BigInteger.valueOf(0);BigInteger end=a;
            BigInteger res=BigInteger.valueOf(0);
            while(start.compareTo(end)==-1){
                BigInteger mid=(start.add(end)).divide(BigInteger.valueOf(2));
                if(mid.multiply(mid).compareTo(a)==0) return mid.intValue();
                else if(mid.multiply(mid).compareTo(a)==1){end=mid.subtract(BigInteger.valueOf(1));}
                else {start=mid.add(BigInteger.valueOf(1)); res=mid;}
        }
           return res.intValue(); 
        }
        
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int j=nearRoot(a);
            int count=0;
            while(j*j<=b){
                int res=j*j;
      //          System.out.println(res+" "+j);
                if(res<=b&&res>=a) count++;
                j++;
            }
            System.out.println(count);
         }
    }
}