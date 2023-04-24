import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);

        int n = kl.nextInt();
        if (n < 1) {
            System.out.println("Invalid input");
            return;
        }

        Circle[] circles = new Circle[n];

        for (int i = 0; i < n; i++) {
            double radius = Math.max(0.0, kl.nextDouble());
            circles[i] = new Circle(radius);
        }

        for (int i = 0; i < n; i++) {
            if (circles[i].getArea() > 30.0) {
                System.out.printf("%.4f\n", circles[i].getArea());
            }
        }
    }
}
