import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        String s="";
        String y;
        if(year==1918)
            s="26.09.1918";
        else
            
        if(year<1918 && (year%4==0))
            {y=Integer.toString(year);
             s="12.09."+year;}
        else
            
        if(year>1918 && ((year%400==0) || (year%4==0 && year%100!=0)) )
             {y=Integer.toString(year);
             s="12.09."+year;}
        else
            {y=Integer.toString(year);
             s="13.09."+year;}
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
