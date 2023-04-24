import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        if(n>0)
        {
        sc.nextLine();  
        String[] arr = sc.nextLine().split(" ");  
        int numCount = 0;  
        int strCount = 0;  

        for (String elem : arr) {
            if (isInteger(elem)) {  
                numCount++;
            } else {
                strCount++;
            }
        }

        System.out.println(numCount);  
        System.out.println(strCount);  
    }
    else
        {
            System.out.println("Invalid"); 
        }
    }

    
    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
