import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int stringConstruction(String s){
        // Complete this function
        String out=s.substring(0,1);
        int count=0;
        for(int i=0;i<s.length();i++){
            int j=s.indexOf(s.charAt(i),i+1);
            if(j<0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
    }
}
