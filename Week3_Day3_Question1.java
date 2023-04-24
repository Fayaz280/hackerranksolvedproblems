import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
        int m=kl.nextInt();
        if(m>=100 && m<=20000 && m%100==0)
        {
          int n[]={2000,500,200,100};
            int c[]= new int[4];
            for(int i=0;i<4;i++)
            {
                if (m >= n[i]) {
                    c[i] = m / n[i];
                    m = m % n[i];
            }
                
        }
            for (int i = 0; i < 2; i++) {
                if (c[i] != 0) {
                    System.out.println("1 100 Notes\n2 500 Notes");
                }
    }

        
    }
        else 
            System.out.println("Invalid Input");
 }
}
