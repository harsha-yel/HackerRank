import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count=0;
        for(int i=0;i<s.length();i=i+3)
        {
            if(s.charAt(i)!='S') count++;
            if(s.charAt(i+1)!='O') count++;
            if(s.charAt(i+2)!='S') count++;
        }   
        System.out.println(count);
    }
}
