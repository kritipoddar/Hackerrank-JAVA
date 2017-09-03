import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        int a[]=new int[5];
        int c0=0, c1=0, c2=0, c3=0, c4=0;
        for(int i=0; i<n; i++)
            {
            switch (types[i])
              {  case 1: 
            c0++;
            a[0]=c0;
            break;
            case 2:
               c1++;
               a[1]=c1;
               break;
               
               case 3:
               c2++;
               a[2]=c2;
               break;
               
               case 4:
               c3++;
               a[3]=c3;
               break;
               
               case 5:
               c4++;
               a[4]=c4;
               break;
       
              }
        }
        int max=a[0];
        int p=0;
        for(int i=0; i<5; i++)
            {
            
                if(max<a[i])
                {
                max=a[i];
                p=i;
            }
            
        }
        System.out.println(p+1);
    }
}
