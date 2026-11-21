
class Student {

    int rollNo;
    String name;

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Student Name: " + name);
    }
}

public class Experiment1 {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.rollNo = 101;
        s1.name = "Rahul";

        s1.display();
    }
}
