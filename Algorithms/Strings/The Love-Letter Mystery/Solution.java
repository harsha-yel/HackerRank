import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int theLoveLetterMystery(String s){
        // Complete this function
        int mid=s.length()/2;
        int index1=mid-1;
        int count=0;
        int index2=(s.length()%2==0)?mid:mid+1;
        for(;index2<s.length();index2++){
            if(s.charAt(index2)!=s.charAt(index1))
                count+=Math.abs((s.charAt(index2))-(s.charAt(index1)));          
            index1--;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }
}
