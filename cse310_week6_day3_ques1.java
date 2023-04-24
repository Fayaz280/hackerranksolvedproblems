public class Student {
    private String name;

    public Student(Object input) {
        if (input instanceof String) {
            this.name = (String) input;
        } else {
            this.name = "Unknown";
        }
    }

    public void printName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Rahul");
        Student student2 = new Student(33);

        student1.printName(); 
        student2.printName(); 
    }
}
