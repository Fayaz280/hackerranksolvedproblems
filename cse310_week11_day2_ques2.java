import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
        String s=kl.nextLine();
        if(s.length()>5)
        {
        int[] cha = new int[256]; 

        
        for (char c : s.toCharArray()) {
            cha[c]++;
        }

        
        for (int i = 0; i < cha.length; i++) {
            if (cha[i] > 0) {
                System.out.print("" + (char) i + ""+ cha[i]);
            }
        }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
