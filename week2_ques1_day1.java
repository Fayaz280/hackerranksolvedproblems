import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner kl= new Scanner(System.in);
  String binary = kl.nextLine();
    int f = Integer.parseInt(binary, 2);
        if(f<90)
        {
          char   c='E';
            System.out.println(c);
        }
        else
        {
           System.out.println("INVALID PAPER CODE"); 
        }
            
 }
}
