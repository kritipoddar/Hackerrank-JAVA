import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String funnyString(String s){
        String r="";
        for(int i=s.length()-1; i>=0; i--)
            {
            r=r+s.charAt(i);
        }
        int flag=0;
        for(int i=1; i<s.length(); i++)
            {
            int c= (int)s.charAt(i)-(int)s.charAt(i-1);
            c= (int) Math.abs(c);
            int d= (int)r.charAt(i)-(int)r.charAt(i-1);
            d= (int) Math.abs(d);
           // System.out.print(c+" "+d+"\n");
            if(c!=d)
             {   flag=1;
                break;
             }
            
        }
        if(flag==1)
            return "Not Funny";
        else
            return "Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
