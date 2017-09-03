import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static int result(String s)
        {
        for(char c='A'; c<='Z'; c++)
            {
            if(s.indexOf(c)<0 && s.indexOf((char)(c+32))<0)
                {
                return -1;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int res=result(st);
        if(res==-1)
            {
            System.out.println("not pangram");
        }
        else
            {
            System.out.println("pangram");
        }
}
}