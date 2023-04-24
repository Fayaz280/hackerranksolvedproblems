import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

enum Subject {
  JAVA("Shruti", 4), OS("Puneet Kumar", 3), AI("James William", 2), ANDROID("Md. Adil Khan", 3);

  private String faculty;
  private int credits;

  Subject(String faculty, int credits) {
    this.faculty = faculty;
    this.credits = credits;
  }

  public String getFaculty() {
    return faculty;
  }

  public int getCredits() {
    return credits;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String subjectName = sc.nextLine();

    try {
      Subject subject = Subject.valueOf(subjectName.toUpperCase());
      System.out.println(subject.getFaculty() + " " + subject.getCredits());
    } catch (IllegalArgumentException e) {
      System.out.println("This subject is not running in this semester.");
    }
  }
}
