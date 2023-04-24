import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


        enum  Librarian
        {
            Monday("8:30 5:30"),Tuesday("8:30 5:30"),Wednseday("8:30 5:30"),Thusday("8:30 5:30"),Friday("8:30 5:30"),Saturday("9:30 4:30");
            
           private final String time;
            
          private  Librarian(String time)
            {
                this.time=time;
                
            }
           public String gettime()
            {
                return time;
            }
            
        }
      public  class Solution 
        {
             public static void main(String[] args)
             {
                 Scanner kl=new Scanner(System.in);
                 String day=kl.nextLine();
                 
                 switch(day)
                 {
                     case "Monday":
                         System.out.println(Librarian.Monday.gettime());
                         break;
                         
                     case "Tuesday":
                         System.out.println(Librarian.Tuesday.gettime());
                         break;
                         
                     case "Wednseday":
                         System.out.println(Librarian.Wednseday.gettime());
                         break;
                         
                     case "Thusday":
                         System.out.println(Librarian.Thusday.gettime());
                         break;
                         
                     case "Friday":
                         System.out.println(Librarian.Friday.gettime());
                         break;
                         
                     case "Saturday":
                         System.out.println(Librarian.Saturday.gettime());
                         break;
                         
                     default:
                         System.out.println("Prints Library is closed");
                         break;
                         
                         
                 }
             }
        }
    
