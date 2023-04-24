import java.util.*;
public class MrsJhunjhunwala {
    
    public static double[] average_marks(double[][] marks) {
        double[] averages = new double[marks.length];
        for (int i = 0; i < marks.length; i++) {
            double sum = 0;
            double max1 = 0, max2 = 0;
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
                if (marks[i][j] > max1) {
                    max2 = max1;
                    max1 = marks[i][j];
                } else if (marks[i][j] > max2) {
                    max2 = marks[i][j];
                }
            }
            averages[i] = (max1 + max2) / 2;
        }
        return averages;
    }
    
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();
        double[][] marks = new double[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = scanner1.nextDouble();
            }
        }
        double[] averages = average_marks(marks);
        for (double average : averages) {
            System.out.print(average + " ");
        }
    }
}
