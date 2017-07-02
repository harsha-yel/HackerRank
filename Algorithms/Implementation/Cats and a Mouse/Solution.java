import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String catCatching(int x,int y,int z){
        if(Math.abs(z-x)==Math.abs(z-y)) return "Mouse C";
        else return (Math.abs(z-x)-Math.abs(z-y))<0?"Cat A":"Cat B";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            System.out.println(catCatching(x,y,z));
        }
    }
}
