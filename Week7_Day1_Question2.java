import java.util.Scanner;

public class FindNthOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read paragraph contents
        String paragraph = sc.nextLine().toLowerCase();

        // Read word and N
        String[] input = sc.nextLine().split(" ");
        String word = input[0].toLowerCase();
        int N = Integer.parseInt(input[1]);

        // Initialize variables for tracking occurrences
        int count = 0;
        int lastOccurrence = -1;

        // Search for occurrences of the word in the paragraph
        for (int i = 0; i <= paragraph.length() - word.length(); i++) {
            if (paragraph.substring(i, i + word.length()).equals(word)) {
                count++;

                if (count == N) {
                    System.out.println(i);
                    return;
                }

                lastOccurrence = i;
            }
        }

        // Check if word not present or occurs less than N times
        if (count == 0) {
            System.out.println("Not Present");
        } else {
            System.out.println(lastOccurrence);
        }
    }
}
