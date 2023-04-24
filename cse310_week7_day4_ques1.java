import java.util.*;

public class Palindrome {
    public static boolean canBePalindrome(String str) {
        int n = str.length();
        int count = 0;
        
        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i) != str.charAt(n-i-1)) {
                count++;
                if (count > 1) {
                    return false;
                }
                if (n % 2 == 0 && i == n/2-1) {
                    return true;
                }
                if (str.charAt(i+1) == str.charAt(n-i-1)) {
                    i++;
                } else if (str.charAt(i) == str.charAt(n-i-2)) {
                    i++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean result = canBePalindrome(str);
        System.out.println(result);
    }
}
