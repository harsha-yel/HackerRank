import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int gemstones(String[] arr){
        // Complete this functio
        HashSet <Character> set=new HashSet<Character>(convertToSet(arr[0]));
        for(int i=1;i<arr.length;i++){
            set.retainAll(convertToSet(arr[i]));
        }
        return set.size();
    }
    public static Set<Character> convertToSet(String s) {
    Set<Character> set = new HashSet<Character>(26);
    for (char c : s.toCharArray())
        set.add(Character.valueOf(c));
    return set;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
