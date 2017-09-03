import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int max=0;
        for(int i=l; i<=r; i++)
            {
            for(int j=l; j<=r; j++)
                {
                int xo= i^j;
                if(xo>=max)
                    {
                    max=xo;
                }
            }
        }
        System.out.println(max);
    }
}