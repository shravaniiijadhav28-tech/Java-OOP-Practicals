
import java.util.ArrayList;
import java.util.Scanner;

// Student class
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

// Main class
public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Collection
        ArrayList<Student> students = new ArrayList<>();

        try {
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {

                System.out.print("Enter student name: ");
                String name = sc.nextLine();

                System.out.print("Enter marks: ");
                int marks = sc.nextInt();
                sc.nextLine();

                // Exception handling
                if (marks < 0 || marks > 100) {
                    throw new IllegalArgumentException(
                        "Marks must be between 0 and 100!"
                    );
                }

                students.add(new Student(name, marks));
            }

            // Multithreading
            Thread t = new Thread(() -> {

                System.out.println("\nStudent Details:");

                for (Student s : students) {
                    s.display();
                    System.out.println();
                }

            });

            t.start();
            t.join();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        sc.close();
    }
}
