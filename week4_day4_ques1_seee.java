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
        int a[]= new int[n];
        int t=0;
        for(int i=0;i<n;i++)
        {
            a[i]=kl.nextInt();
            t+=a[i];
            
        }
        System.out.println(t);
        
    }
}
