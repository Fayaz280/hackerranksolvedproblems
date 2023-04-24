import java.util.Scanner;

public class DoubleToIntArrayConverter {
    public static void main(String[] args) {
        Scanner kl=new Scanner(System.in);
        
        
        int size =kl.nextInt();
      
        if (size < 1) {
            System.out.println("Invalid Array Size");
            return;
        }
        
      
        double[] doubleArray = new double[size];
        
        for (int i = 0; i < size; i++) {
            doubleArray[i] = kl.nextDouble();
        }
        
       
        int[] intArray = new int[size];
        boolean invalidElements = false;
        for (int i = 0; i < size; i++) {
            if (doubleArray[i] < 0) {
                invalidElements = true;
                break;
            }
            intArray[i] = (int) doubleArray[i];
        }
        
      
        if (invalidElements) {
            System.out.println("Invalid Array Elements");
        } else {
           
            for (int i = 0; i < size; i++) {
                System.out.println(intArray[i]);
            }
        }
        
        kl.close();
    }
}
