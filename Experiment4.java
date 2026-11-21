abstract class Shape {

    abstract void area();

    void display() {
        System.out.println("This is a shape");
    }
}

interface Printable {
    void print();
}

class Circle extends Shape implements Printable {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println(
            "Area of Circle = " + (Math.PI * radius * radius)
        );
    }

    public void print() {
        System.out.println("Circle is printable");
    }
}

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(5);

        c.display();
        c.area();
        c.print();
    }
}
