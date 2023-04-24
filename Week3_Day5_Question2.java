import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
        int N=kl.nextInt();
        if(N>0 && N<100)
        {
            for(int i=0;i<=N;i++)
            {
                System.out.println(i);
            }
            System.out.println("Games End");
        }
        else
             System.out.println("Invalid Input");
    }
}
