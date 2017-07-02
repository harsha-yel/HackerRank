import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                a[i][j] = in.nextInt();
            }
        }
        int max_sum=-10000;int sum_hour=0;
        for(int i=1;i<a.length-1;i++)
            for(int j=1;j<a[0].length-1;j++)
            {
                sum_hour=a[i-1][j-1]+a[i-1][j]+a[i-1][j+1]+a[i][j]+a[i+1][j-1]+a[i+1][j]+a[i+1][j+1];
                if(max_sum<sum_hour)
                    max_sum=sum_hour;
        }    
        System.out.println(max_sum);
    }
}
