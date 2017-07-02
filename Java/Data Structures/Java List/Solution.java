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
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            list.add(sc.nextInt());
        int queries=sc.nextInt();
        for(int i=0;i<queries;i++){
            String str=sc.next();
            if(str.compareTo("Insert")==0)
            {
                int index=sc.nextInt();
                int element=sc.nextInt();
                list.add(index,element);

            }    
            else if(str.compareTo("Delete")==0){
                int deleteElement=sc.nextInt();
                list.remove(deleteElement);
            }
        }
        for(int i:list)
            System.out.print(i+" ");
    }
}
