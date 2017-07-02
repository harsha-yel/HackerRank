import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int divisibleCount(int n){
        int rem=0;int actual=n;
        int count=0;
        while(n>0){
            rem=n%10;
            if(rem!=0&&actual%rem==0) count++;
            n=n/10;
            
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(divisibleCount(n));
        }
    }
}
