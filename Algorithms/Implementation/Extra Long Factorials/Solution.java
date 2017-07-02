import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static BigInteger fact(int k){
        BigInteger res=BigInteger.valueOf(k);
        for(int i=k-1;i>0;i--)
            res=res.multiply(BigInteger.valueOf(i));
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger k=BigInteger.valueOf(n);
        BigInteger res=fact(n);
        System.out.println(res);
    }
}
