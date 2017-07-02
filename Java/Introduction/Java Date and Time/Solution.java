import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        LocalDate dt = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        System.out.print(dt.getDayOfWeek());
    }
}
