import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();
        if (n < 10 || n > 500) {
            System.out.println("Invalid Input");
        } else {
            if (check(n)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        st.close();
    }
    
    public static boolean check(int n) {
        return n % 2 == 0 && n % 13 == 0;
    }
}
