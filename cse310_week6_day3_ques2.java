import java.util.Scanner;

public class TreeSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] trees = new int[10];

        // Read in the tree heights
        for (int i = 0; i < 10; i++) {
            trees[i] = sc.nextInt();
        }

        // Sort the trees using swapping logic
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (trees[i] > trees[j]) {
                    // Swap trees[i] and trees[j]
                    int temp = trees[i];
                    trees[i] = trees[j];
                    trees[j] = temp;
                }
            }
        }

        // Print out the sorted trees
        for (int i = 0; i < 10; i++) {
            System.out.print(trees[i] + " ");
        }
    }
}
