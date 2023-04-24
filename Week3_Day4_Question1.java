import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
        
        int r=kl.nextInt();
    
      if(r>0 && r<=10){
    
      for (int i = r; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
          System.out.print(j + " ");
        }
        System.out.println();
      }
      }
        else
            System.out.println("Invalid Rows");
    
    
    }
}
