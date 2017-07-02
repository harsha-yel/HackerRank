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
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();                
        
        /*Reading from stdin and adding into the lists*/
        
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<d;j++){
                int e=sc.nextInt();
                list.add(e);
            }
            lists.add(list);
        }
        /*Reading the queries and output the answer to stdout */
        
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c;
            
            try{
                c=(lists.get(a-1).get(b-1));    
                System.out.println(c);
            }catch(Exception e){System.out.println("ERROR!");}
        }
        
        
        
    }
}