import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      HashMap<String,Integer> set=new HashMap<String,Integer>();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         set.put(name,phone); 
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         if(set.containsKey(s)) System.out.println(s+"="+set.get(s));
          else System.out.println("Not found");
      }
   }
}
