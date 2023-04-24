import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.print("Enter the String: ");
        String inputString = scanner.nextLine();
        
        if (inputString == null || inputString.matches(".*\\d.*")) {
            System.out.println("Invalid input");
        } else {
            String[] words = inputString.split("\\s+");
            String reversedString = "";
            for (String word : words) {
                String reversedWord = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversedWord += Character.toLowerCase(word.charAt(i));
                }
                reversedString += reversedWord + " ";
            }
            System.out.println(reversedString.trim());
        }
    }
}
