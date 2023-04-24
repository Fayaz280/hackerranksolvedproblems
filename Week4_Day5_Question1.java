import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
        
         int numSub = kl.nextInt();

        
        double[][] marks = new double[numSub][];
        for (int i = 0; i < numSub; i++) {
            
            int numCAs =kl.nextInt();

            marks[i] = new double[numCAs];
            for (int j = 0; j < numCAs; j++) {
                
                marks[i][j] = kl.nextDouble();
            }
        }

       
        int subNum = kl.nextInt();

        double sum = 0;
        for (double mark : marks[subNum - 1]) {
            sum += mark;
        }
        double avg = sum / marks[subNum - 1].length;

        System.out.println("Average in Subject-" + subNum + " is " + avg);
    }
}
