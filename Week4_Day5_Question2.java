import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);
        String[] array1 = kl.nextLine().split(" ");
        String[] array2 = kl.nextLine().split(" ");

        int c = 0;
        for (String i : array1) {
            for (String item2 : array2) {
                if (i.equals(item2)) {
                    c++;
                }
            }
        }

        System.out.println(c);
    }
}
