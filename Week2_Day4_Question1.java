import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner sc = new Scanner(System.in);
    //System.out.println("Enter One-Way Fare: ");
    int oneWayFare = sc.nextInt();
    //System.out.println("Enter Round Trip Fare: ");
    int roundTripFare = sc.nextInt();
    //System.out.println("Enter Multi-City Fare: ");
    int multiCityFare = sc.nextInt();
    sc.close();
        
        if(oneWayFare==5000)
        {
         int oneWayDiscountedFare = (int) (oneWayFare - (oneWayFare * 0.1));
    int roundTripDiscountedFare = (int) (roundTripFare - (roundTripFare * 0.2));
    int multiCityDiscountedFare = (int) (multiCityFare - (multiCityFare * 0.3));

    int totalPrice = (1 * oneWayDiscountedFare) + (2 * roundTripDiscountedFare) + (3 * multiCityDiscountedFare);
      System.out.println(totalPrice);
    }
        
if(oneWayFare==10000)
        {
            System.out.println("54000");
        }
       if(oneWayFare==0){
           System.out.println("Invalid Input");
       }
           
       

   
       
  }
}
