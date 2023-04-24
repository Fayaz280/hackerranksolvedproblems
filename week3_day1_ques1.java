import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
    
        
        String f=kl.nextLine();
        char f2=kl.next().charAt(0);
        int c=0;
       int  i=0;
        while(i<f.length()){
            if(f.charAt(i)==f2)
            {
                c=c+1;
                
            }
            i++;
        }
        System.out.println(c);
    }
}
