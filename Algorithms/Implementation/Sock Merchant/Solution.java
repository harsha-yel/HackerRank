import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        int temp=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(map.get(ar[i])!=null){
                int count=map.get(ar[i])+1;
                map.put(ar[i],count);
             
            }
            else
                map.put(ar[i],1);
        }

        for(Map.Entry m:map.entrySet()){
            int val=(int)m.getValue();
            if(val%2==0) temp=temp+(val/2);
            else if(val%2==1&&val!=1) temp=temp+(val/2);
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
