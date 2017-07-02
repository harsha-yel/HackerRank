import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        k=k%n;
        for(int a_i=0; a_i < n; a_i++){
            int buf= in.nextInt();
            if(a_i+k>n-1) a[a_i+k-n]=buf;
            else a[a_i+k]=buf;
        }
       //  System.out.println(Arrays.toString(a));
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(a[m]);
        }
    }
}
