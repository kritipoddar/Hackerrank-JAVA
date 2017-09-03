import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int l=s.length();
        char c;
        int count=1;
        for(int i=0; i<l; i++)
            {
            c=s.charAt(i);
            if(Character.isUpperCase(c))
                {
                count++;
            }
        }
        System.out.println(count);
    }
}
