
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    abstract void showDetails();
}

// Interface
interface Display {
    void display();
}

// Full Time Employee
class FullTimeEmployee extends Employee implements Display {

    FullTimeEmployee(String name, int id) {
        super(name, id);
    }

    double calculateSalary() {
        return 30000;
    }

    void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + calculateSalary());
    }

    public void display() {
        showDetails();
    }
}

// Part Time Employee
class PartTimeEmployee extends Employee implements Display {

    PartTimeEmployee(String name, int id) {
        super(name, id);
    }

    double calculateSalary() {
        return 15000;
    }

    void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + calculateSalary());
    }

    public void display() {
        showDetails();
    }
}

// Main Class
public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Rahul", 101);
        Employee e2 = new PartTimeEmployee("Priya", 102);

        System.out.println("===== Employee Management System =====");
        System.out.println();

        e1.showDetails();

        System.out.println();

        e2.showDetails();
    }
}
