import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   
    static int gcdFunction(int b[]){
        int result=b[0];
        for(int i=1;i<b.length;i++)
            result=gcdFunction(result,b[i]);
        return result;
    }
    static int gcdFunction(int a,int b){
        int temp=0;
        while(b>0){
            temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static int lcmFunction(int a, int b)
    {
        return a * (b / gcdFunction(a, b));
    }

    static int lcmFunction(int[] input)
    {
        int result = input[0];
        for(int i = 1; i < input.length; i++) result = lcmFunction(result, input[i]);
        return result;
    }
    
    static int getTotalX(int[] a, int[] b){
        // Complete this function
        int result=0;int n=1;
        int maxElement=-(int)Math.pow(2,32);
        //LCM of a[]
        int lcm=lcmFunction(a);
        int gcd=gcdFunction(b);
        
        int maxi=0;
        while(maxi<=gcd){
            int flag=1;
            maxi=lcm*n;

            for(int i=0;i<b.length;i++){
                if(!(b[i]%maxi==0))
                    flag=0;
            }
            if(flag==1) result++;
            n++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
