import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        String s= sc.next();
        int k=sc.nextInt();
        int i,num=0;
        char ch;
        String st="";
        if(k>26)
            {
            k=k%26;
        }
        for(i=0; i<l; i++)
            {
            ch=s.charAt(i);
            if(Character.isLetter(ch))
                {
                if((int)ch >= 65 && (int)ch <= 90)
        {
            num = (int)ch + k;
            if(num>90){
                num=(64+num-90);
            }
            ch= (char) num;

        }
        if((int)ch >= 97 && (int)ch <= 122)
        {
            num = (int)ch + k;
            if(num>122){
                num=(96+num-122);
                }
            ch=(char) num;

        }
               
            }
            st=st+ch; 
        }
        System.out.println(st);
    }
}