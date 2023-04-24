import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);
       
       int n=kl.nextInt();
        int[] arr = new int[n];
        if(n>5&&n<15)
        {
       
        for (int i = 0; i < n; i++) {
            arr[i] = kl.nextInt();
        }
        
        int c = kl.nextInt();
        if (c == 1) {
            Arrays.sort(arr);
        
            for (int i = 0; i < n; i++) {
                if (i == 0 || arr[i] != arr[i-1]) {
                    System.out.print(arr[i] + " ");
                }
            }
        } else if (c == 2) {
            Arrays.sort(arr);
           
            for (int i = n-1; i >= 0; i--) {
                if (i == n-1 || arr[i] != arr[i+1]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        } else {
            System.out.println("Invalid");
        }
    }
}
