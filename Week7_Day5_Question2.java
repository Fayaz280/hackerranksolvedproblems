import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);
        String statement = kl.nextLine();
        int n = kl.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Invalid Input");
            return;
        }

        String[] words = statement.split(" ");  
        int count = 0;
        for (String word : words) {
            if (word.length() == n) {
                count++;
            }
        }

        System.out.println(count);
    }
}
