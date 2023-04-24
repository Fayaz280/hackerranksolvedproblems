import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
        
        int n=kl.nextInt();
        int c=0;
      if(n<=7)
      {
        int mar[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            mar[i]=kl.nextInt();
            c+=mar[i];
        }
          double b=c/n;
          
          if(b>10)
              
          {
              if(b>90)
              {
                  char c1='A';
                  char c2='+';
              System.out.println(c1+c2);
              }
              if(b>=70 && b<=89)
              {
                  char c1='A';
                   System.out.println(c1);
              }
              if(b>=60 && b<=69)
              {
                  char c1='B';
                   System.out.println(c1);
              }
              if(b>=50 && b<=59)
              {
                  char c1='c';
                   System.out.println(c1);
              }
              if(b<=49)
              {
                  char c1='D';
                   System.out.println(c1);
                      
              }
          }
          else
          {
              System.out.print("Invalid");
          }
     
    }
    }
            
}
