import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
        int N=kl.nextInt();   
        int c=0;
        for(int i=2; i<N; i++)
        {
            if(N%i==0)
            {
                c++;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("Prime Number");
        }
             
        else
        {
            System.out.println("Not Prime Number");
        }
             
       
    }
}
