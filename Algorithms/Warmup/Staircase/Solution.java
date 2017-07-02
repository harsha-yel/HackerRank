import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str="#";
        for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++)
                System.out.print(" ");
           for(int k=0;k<i;k++)
                System.out.print("#");
            System.out.print("\n");
        }  
     }
        
}
