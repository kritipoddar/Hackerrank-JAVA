import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        for(int i=0; i<grades.length; i++)
            {
            int mul, j=grades[i];
            if(j<38)
                {
                mul=j;
                grades[i]=mul;
            }
            else{
            if((j%5)==0)
              {  mul=j;
               grades[i]=mul;
              }
            if(((j+1)%5)==0)
              {  mul=j+1;
               grades[i]=mul;
              }
            if(((j+2)%5)==0)
              {  mul=j+2;
               grades[i]=mul;
              }
            }
        }
        return (grades);
            
        }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
