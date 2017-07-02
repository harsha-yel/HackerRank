import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static HashSet<Integer> list=new HashSet<Integer>();

    public static void weights(String s){
        int sum=0;int count=1;
        for(int i=0;i<s.length()-1;i++){
            
            char current=s.charAt(i);
            char next=s.charAt(i+1);
            list.add(current-96);
            if(next!=current) {count=1;}
            if(next==current){count++; }
            if(count>1) list.add((current-96)*count);
        }
        list.add(s.charAt(s.length()-1)-96);
     //   System.out.println(list);

 }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        weights(s);
        
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            // your code goes here
            System.out.println((list.contains(x)==true)?"Yes":"No");    
        }
    }
}
