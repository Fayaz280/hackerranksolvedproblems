import java.util.*;

public class Main {
  
  
  public static void primeFactors(int n) {
   
    List<Integer> factors = new ArrayList<>();

   
    for (int i = 2; i <= Math.sqrt(n); i++) {
      
      while (n % i == 0) {
        factors.add(i);
        n /= i;
      }
    }

    if (n > 1) {
      factors.add(n);
    }
    
  
    Collections.sort(factors);
    for (int factor : factors) {
      System.out.print(factor + " ");
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    if (n < 10 || n > 50) {
      System.out.println("Invalid");
      return;
    }
    primeFactors(n);
  }
}
