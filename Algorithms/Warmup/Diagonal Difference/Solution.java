import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // int arr[][]=new int[n][n];
        int sumPrimary=0;
        
        int sumSecondary=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
            int element=sc.nextInt();
            if(i==j) sumPrimary+=element;
            if(i+j==n-1)  sumSecondary+=element;
         }
        sc.close();
        System.out.println(Math.abs(sumPrimary-sumSecondary));
    
    }
}