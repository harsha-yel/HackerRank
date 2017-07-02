import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            String out="hackerrank";
            int j=0;
            for(int i=0;i<s.length();i++)
                if(j<out.length()&&s.charAt(i)==out.charAt(j))
                    j++;
            System.out.println(j==out.length()?"YES":"NO");
        }
        
    }
}
