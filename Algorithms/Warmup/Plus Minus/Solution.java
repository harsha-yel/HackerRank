import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count0=0,countPos=0,countNeg=0;
        for(int i=0;i<n;i++){
            int element=sc.nextInt();
            if(element>0) countPos++;
            else if(element==0) count0++;
            else countNeg++;
        }
        sc.close();
        System.out.format("%.6f"+"\n",(float)countPos/n);
        System.out.format("%.6f"+"\n",(float)countNeg/n);
        System.out.format("%.6f",(float)count0/n);

       //    System.out.format((float)countPos/n+"\n"+(float)countNeg/n+"\n"+(float)count0/n);
    
    }
}