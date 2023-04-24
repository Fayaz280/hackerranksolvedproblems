import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner kl=new Scanner(System.in);
        int E_ID=kl.nextInt();
        kl.nextLine();
       String  E_name=kl.nextLine();
       String  E_des=kl.nextLine();
        if(E_ID>201)
        {
            int salary=20000;
            salary+=1000;
            System.out.println(E_name+",\n"+E_ID+",\n"+salary);
        }
        else{
             System.out.println("No Appraisal");
        }
    }
}
