import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Student
{
     String name;
     int registrationNo;
     int c;
    void get_details()
       
    {
        Scanner kl=new Scanner(System.in);
        c=kl.nextInt();
        
        if(c==1)
        {
            kl.nextLine();
            name=kl.nextLine();
            registrationNo=kl.nextInt();
            if(registrationNo>0)
            {
                 System.out.println(name+","+registrationNo);
            }
            else
            {
            
            System.out.println();
            }
        }
        else if(c==2)
        {
            System.out.println(name+","+registrationNo);
        }
        else
        {
            System.out.println("Wrong Choice");
        }
    }
}


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Student s1=new Student();
        s1.get_details();
    }
}
