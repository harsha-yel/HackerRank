import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        int n=0;int z1=0,z2=0;
        while(true){
            z1=x1+n*v1;
            z2=x2+n*v2;
            
            if(z1==z2)
                return "YES";
            else if((v2>=v1 && z2>z1)||(v2<=v1 && z2<z1))
               return "NO";
            n++;
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
