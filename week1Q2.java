import java.io.*;
import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class week1Q2{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
        int a=kl.nextInt();
        int b=kl.nextInt();
        int c=kl.nextInt();
        float z=(a+b+c);
        double v=z/3;
        DecimalFormat d=new DecimalFormat("#.#");
        d.setRoundingMode(RoundingMode.FLOOR);
        System.out.println((d.format(v)));
        
    }
}