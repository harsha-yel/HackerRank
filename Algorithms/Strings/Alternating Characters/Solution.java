import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int alternatingCharacters(String s){
        // Complete this function
        String buf="";int count=0;
        for(int i=0;i<s.length()-1;i++){
            char current=s.charAt(i);
            char next=s.charAt(i+1);
            if(next==current) {count++;}
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}
