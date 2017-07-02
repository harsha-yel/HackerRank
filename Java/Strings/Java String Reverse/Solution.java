import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
     
       char ch[]=A.toCharArray();
       int l=0;int r=ch.length-1;
        int count=0;
       while(l<r){
           if(ch[l]==ch[r])
               count++;
           else
               break;
           l++;r--;
       }
       if(count==(A.length()/2))
              System.out.println("Yes");
       else
              System.out.println("No");

        
    }
}
