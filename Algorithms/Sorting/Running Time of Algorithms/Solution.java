import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        int count=0;
        for(int i=1;i<n;i++){
            int key=ar[i];
            int j=i-1;
            while(j>=0&& key<ar[j])
            {    
                ar[j+1]=ar[j];
                count++;
                j--;
            }
            ar[j+1]=key;
        }
        System.out.println(count);
    }
}