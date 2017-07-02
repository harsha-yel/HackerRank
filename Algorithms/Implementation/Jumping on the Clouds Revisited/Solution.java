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
        int a[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            a[c_i] = in.nextInt();
        }
        int energy=100;
        for(int i=0;i<n;i=i+k)
            energy=(a[i]==1)?energy-3:energy-1; 
        
        System.out.println(energy);     
        
    }
}
