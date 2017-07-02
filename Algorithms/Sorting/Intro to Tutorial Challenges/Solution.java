import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int index=in.nextInt();
        int n=in.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=in.nextInt();
        for(int i=0;i<n;i++)    
            if(ar[i]==index) {System.out.println(i);break;}
    }
}