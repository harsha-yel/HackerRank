import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int seaLevel=0;
        int nValleys=0;
        int nMountains=0;
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='U') {
                if(seaLevel==0) nMountains++;
                seaLevel++;
            }
            if(ch[i]=='D'){
                if(seaLevel==0) nValleys++;
                seaLevel--;
            }
            
        }
        System.out.println(nValleys);
    }
}