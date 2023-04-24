import java.io.*;
import java.util.*;

public class Solution{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner kl=new Scanner(System.in);
        long Account_Number=kl.nextLong();
        kl.nextLine();
        String Account_Holder_Name=kl.nextLine();
        
        char Gender=kl.next().charAt(0);
        int  Amount_to_be_withdrawn=kl.nextInt();
        int    Current_Account_Balance_is=20000;
        
        
        int c;
        if(Amount_to_be_withdrawn<=20000 && Gender=='M')
        {
            c=Current_Account_Balance_is-Amount_to_be_withdrawn;
            System.out.println("Hi Mr. "+Account_Holder_Name+"!\nYour Account Balance after withdrawl is "+c+".");
        }
        else if(Amount_to_be_withdrawn<=20000 && Gender=='F')
        {
            c=Current_Account_Balance_is-Amount_to_be_withdrawn;
            System.out.println("Hi Ms. "+Account_Holder_Name+"!\nYour Account Balance after withdrawl is "+c+".");
        }
        else
        {
            System.out.println("Hi Ms. "+Account_Holder_Name+"!\nInsufficient Funds! You can not withdraw "+Amount_to_be_withdrawn+".");
        }
    }
}
