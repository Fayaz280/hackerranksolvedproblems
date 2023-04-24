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
        int fac=1;
        if(n>0&&n<=10)
        {
        int i=1;
        while(i<=n)
        {
            fac*=i;
            i++;
        }
        System.out.println(fac);
        }
    }
}
