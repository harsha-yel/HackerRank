import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        // Complete this function
        if(year>1918){
            if((year%4==0&&(year%100!=0))||(year%400==0))
                return "12.09."+year;
            else return "13.09."+year;
        }
       else if(year<1918){
            if(year%4==0) return "12.09."+year;
            else return "13.09."+year;
        }
        else return (256-(31*5)-28-(2*30)-1+14)+".09."+year;
        
    }
        

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
