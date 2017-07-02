import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* 
        Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int bitSize=sc.nextInt();
        BitSet b1=new BitSet(bitSize);
        BitSet b2=new BitSet(bitSize);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String opr=sc.next().toLowerCase();
            int res=sc.nextInt();
            int index=sc.nextInt();

         if(opr.equals("and"))   {
                if(res==1) b1.and(b2);
                else b2.and(b1);
        }
         else if(opr.equals("or"))   {
                if(res==1) b1.or(b2);
                else b2.or(b1);
        }
           else if(opr.equals("set"))   {
                if(res==1) b1.set(index);
                else b2.set(index);
        }
         else if(opr.equals("flip"))   {
                if(res==1) b1.flip(index);
                else b2.flip(index);
        }
        else if(opr.equals("xor"))   {
                if(res==1) b1.xor(b2);
                else b2.xor(b1);
        }
        System.out.println(b1.cardinality()+" "+b2.cardinality());
    
        }
    }
    
}