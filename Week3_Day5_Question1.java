import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner kl=new Scanner(System.in);
        float p_amount=kl.nextFloat();
        //System.out.println(p_amount);
        int s=kl.nextInt();
        DecimalFormat d=new  DecimalFormat("0.00");
        d.setRoundingMode(RoundingMode.FLOOR);
        switch(s)
        {
                case 1:
                   float w_amount=kl.nextFloat();
                  if (w_amount<=p_amount)
                  {
                     float total=p_amount-w_amount;
                      total+=0.01;
                     System.out.println((d.format(total)));   
                  }
                else
                    System.out.println("Error"); 
                break;
                
            case 2:
                float d_amount=kl.nextFloat();
                float total=p_amount+d_amount;
                
                System.out.println((d.format(total)));
                break;
                
            case 3:
                System.out.println(p_amount);
                
            default:
               System.out.println("Error");
}
    }
}
