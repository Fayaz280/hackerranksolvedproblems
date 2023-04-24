import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
        int b=kl.nextInt();
        b=b*110/100;
        double emi=b/12;
        emi=emi+0.33;
        System.out.println(b+"\n"+emi);
    }
}
