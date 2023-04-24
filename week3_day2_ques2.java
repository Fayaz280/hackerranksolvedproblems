import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);
        int rows = kl.nextInt();
        if (rows <= 0) {
            System.out.println("Invalid Input");
        } else {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("&");
                }
                System.out.println();
            }
        }
    }
}
