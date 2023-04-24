import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner kl = new Scanner(System.in);
        int n = kl.nextInt();  // number of games played
        int k = 7;  // fixed number of coins
         if(n>0 && n<=5)
         {
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < k; j++) {
                int coin = kl.nextInt();
                total += coin;
            }
            if (total == 56) {
                System.out.println(1);  // win
            } else {
                System.out.println(0);  // loss
            }
        }
         }
        
    }
}
