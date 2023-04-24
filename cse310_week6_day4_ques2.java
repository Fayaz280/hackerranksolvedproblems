import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);

        // Accept the size and elements of the first array
        int size1 = kl.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = kl.nextInt();
        }

        // Accept the size and elements of the second array
        int size2 = kl.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = kl.nextInt();
        }

        // Accept the size and elements of the third array
        int size3 = kl.nextInt();
        int[] arr3 = new int[size3];
        for (int i = 0; i < size3; i++) {
            arr3[i] = kl.nextInt();
        }

        // Find the common elements in the three arrays
        List<Integer> common = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < size1; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < size2; i++) {
            if (set1.contains(arr2[i])) {
                set2.add(arr2[i]);
            }
        }
        for (int i = 0; i < size3; i++) {
            if (set2.contains(arr3[i])) {
                common.add(arr3[i]);
            }
        }

        // Sort the common elements in ascending order
        Collections.sort(common);

        // Print the common elements
        for (int element : common) {
            System.out.print(element + " ");
        }
    }
}
