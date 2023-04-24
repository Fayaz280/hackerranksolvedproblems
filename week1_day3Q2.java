import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
         int N=kl.nextInt();
        int b = (int) Math.round(Math.pow(N, 1.0/3.0));
        
            if(N==b*b*b)
            {
                System.out.println("Perfect Cube");
            }
          else 
            System.out.println("Not Perfect Cube");
        
    }
}
