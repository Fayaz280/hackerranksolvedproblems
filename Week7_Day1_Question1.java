import java.util.Scanner;

public class EvaluateTestPapers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read correct answers
        String correctAnswers = sc.nextLine().toUpperCase();

        // Read number of students
        int numStudents = sc.nextInt();

        // Create array to store marks for each student
        double[] marks = new double[numStudents];

        // Read answer strings for each student and compute marks
        for (int i = 0; i < numStudents; i++) {
            String studentAnswers = sc.next().toUpperCase();

            // Make sure answer string has the same length as correct answers
            if (studentAnswers.length() != correctAnswers.length()) {
                System.out.println("Incorrect Input");
                return;
            }

            // Compute marks for each question
            for (int j = 0; j < correctAnswers.length(); j++) {
                char studentAnswer = studentAnswers.charAt(j);
                char correctAnswer = correctAnswers.charAt(j);

                if (studentAnswer == 'X') {
                    continue; // Question not attempted, no marks or penalty
                } else if (studentAnswer == correctAnswer) {
                    marks[i]++; // Correct answer, add 1 mark
                } else {
                    marks[i] -= 0.25; // Incorrect answer, deduct 0.25 marks
                }
            }
        }

        // Print marks for each student
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
