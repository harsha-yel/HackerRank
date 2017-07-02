import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import org.apache.commons.lang.ArrayUtils;
public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int a[]={0,0,0,0,0,0};
        for(int i=0;i<n;i++){
            a[ar[i]]++;
        }
        List b = Arrays.asList(ArrayUtils.toObject(a));
        return (b.indexOf(Collections.max(b)));
       }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
