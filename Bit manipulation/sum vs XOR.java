import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long c, count=0;
        while(n!=0)
            {
            c=n%2;
            count+= (c==1) ? 0:1;
            n=n/2;
        }
        count= (long)Math.pow(2,count);
        System.out.println(count);
    }
}