 import java.util.*;
import org.apache.commons.lang3.ArrayUtils;
public class Solution {
       
       static void partition(int[] ar) {
           List<Integer> left=new ArrayList<Integer>();
           List<Integer> right=new ArrayList<Integer>();
           int equal=ar[0];
           for(int i=1;i<ar.length;i++){
               if(ar[i]<equal) left.add(ar[i]);
               if(ar[i]>equal) right.add(ar[i]);
           }
      //     Integer[] leftarr = eft.toArray(new Integer[left.size()]);
       //    Integer[] rightarr = right.toArray(new Integer[right.size()]);
           int[] larr = ArrayUtils.toPrimitive(left.toArray(new Integer[left.size()]));
           int[] rarr = ArrayUtils.toPrimitive(right.toArray(new Integer[right.size()]));

           //System.out.println(left.toArray());
           printArray(larr);
           System.out.print(equal+" ");
           printArray(rarr);
       }   
 
      static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
          // System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }
