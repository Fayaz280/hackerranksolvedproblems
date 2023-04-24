import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    String str = "example string";
    int n = 5;

    
    Predicate<String> valid = (s) -> s.length() > n;

    
    if (n < 1) {
      System.out.println("Invalid input");
    } else if (valid.test(str)) {
      System.out.println("Valid string");
    } else {
      System.out.println("Invalid string");
    }
  }
}
