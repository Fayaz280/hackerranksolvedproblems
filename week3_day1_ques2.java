import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
        
        int borr=kl.nextInt();
  
        borr=borr*110/100;
        double mon=borr/12;
        double mon1=mon+0.33;
        System.out.println(borr+"\n"+mon1);
    }
}
