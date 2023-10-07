// abstraction: process of provideing a simplified interface to an object that hides its complexity.
// Abstract Classes:An abstract class is a class that cannot be instantiated (you cannot create objects of an abstract class), and it may have abstract methods (methods without a body) that must be implemented by any concrete (non-abstract) subclass. Abstract classes are declared using the abstract keyword.
abstract class Shape {
    int x, y;

    abstract void draw(); // Abstract method

    void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
}

class Circle extends Shape {
    int radius;

    void draw() {
        System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius);
    }
}

// interface: An interface is a collection of abstract methods (methods without a body) that define a contract for classes that implement the interface. Unlike abstract classes, interfaces cannot have instance variables, and a class can implement multiple interfaces. Interfaces are declared using the interface keyword.

interface Drawable {
    void draw();
}

interface Movable {
    void move(int newX, int newY);
}

class Circle implements Drawable, Movable {
    int x, y;
    int radius;

    @Override
    public void draw() {
        System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
}
