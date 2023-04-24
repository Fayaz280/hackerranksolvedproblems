import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

class Student {
    String name;
    int rollNo;
    String department;

    public Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);
        int n = kl.nextInt();
        if (n <= 1) {
            System.out.println("Invalid");
            return;
        }
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = kl.next();
            int rollNo = kl.nextInt();
            String department = kl.next();
            students.add(new Student(name, rollNo, department));
        }
        Predicate<Student> cseStudentPredicate = student -> student.department.equals("CSE");
        for (Student student : students) {
            if (cseStudentPredicate.test(student)) {
                System.out.println(student.rollNo);
            }
        }
    }
}
