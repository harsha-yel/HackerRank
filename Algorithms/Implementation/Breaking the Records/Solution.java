import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        int result[]=new int[2];
        result[0]=0;result[1]=0;
        int maxValue=s[0];
        int minValue=s[0];
        for(int i=1;i<s.length;i++){
            if(s[i]>maxValue) result[0]++;
            if(s[i]<minValue) result[1]++;
            maxValue=Math.max(maxValue,s[i]);
            minValue=Math.min(minValue,s[i]);         
    }
        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
