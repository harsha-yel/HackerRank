import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long minSum=(long)Math.pow(2,63)-1;
        long maxSum=-(long)Math.pow(2,64);
        int n=5;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=0;j<n;j++){
                if(i!=j)   sum+=arr[j];
            }
            minSum=Math.min(minSum,sum);
            maxSum=Math.max(maxSum,sum);
            //System.out.println(sum);

        }
        System.out.println(minSum+" "+maxSum);
           
        
    }
}
