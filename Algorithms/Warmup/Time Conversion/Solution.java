import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        char ch[]=s.toCharArray();
        String dur=s.substring(ch.length-2,ch.length);
        if(dur.equals("PM")&&(!s.substring(0,2).equals("12")))
            s=Integer.toString((Integer.parseInt(s.substring(0,2))+12))+s.substring(2,ch.length-2);
        else if(dur.equals("AM")&&s.substring(0,2).equals("12"))
            s="00"+s.substring(2,ch.length-2);
        else s=s.substring(0,ch.length-2);
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
