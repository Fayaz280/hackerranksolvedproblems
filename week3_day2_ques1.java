import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firw = sc.next();
        String secw = sc.next();
        
        
        
        if(firw.length()!=secw.length())
        {
            System.out.println("Not Similar");
        }
        else
        {
            System.out.println("Similar");
            
        }
    }
    
}
