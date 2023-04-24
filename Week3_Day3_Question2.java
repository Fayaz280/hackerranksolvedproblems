import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner kl=new Scanner(System.in);
        int f=kl.nextInt();
        int s=kl.nextInt();
        if (s==1)
        {
            if(f%2==0)
                System.out.println("Yes");
            else
                 System.out.println("NO");
        }
        if(s==2)
        {
            if(f%2!=0)
                System.out.println("Yes");
            else
                System.out.println("NO");
        }
        if(s==3)
        {
            boolean flag = false;
    for (int i = 2; i <= f / 2; ++i) {
      // condition for nonprime number
      if (f % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println("Yes");
    else
      System.out.println("NO");
            
            
        }
        if(s==4)
        {
            int c=1;
   
   for(int i=1;i<=f;i++)
   {
     c=c*i;
   }
   System.out.print(c);
        }
        
    }
}
