import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b){
        int l1=a.length;
        int l2=b.length;
        int s= a[l1-1];
        int t=b[0];
        int d,count =0, c=0, e=0;
        int flag1=0, flag2=0;
        if(t%s==0)
            {
            
            for(int i=s; i<=t; i++)
                {
                c=0;
                e=0;
                flag1=0;
                flag2=0;
                for(int j=0; j<l1; j++)
                    {
                    if((i% a[j]) ==0)
                        c++;
                    if(c==l1)
                        flag1=1;
                }
              
                for(int k=0; k<l2; k++)
                    {
                    if((b[k]%i) ==0)
                        e++;
                   //System.out.println(e);
                    //System.out.println(l2);
                    if(e==l2)
                       { flag2=1;
                       }
                }
                if(flag1==1 && flag2==1)
                    {
                   //System.out.println(i);
                    count++;
                    }
            }
        }
        return count;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
