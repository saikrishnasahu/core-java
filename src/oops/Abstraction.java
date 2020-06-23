package oops;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class Abstraction {
    public static void main(String[] args) {
        Bike1 bike = new Honda1();
        bike.run();

        Printable printable = new PrintableImpl();
        printable.print();

        MultipleImpl multiple = new MultipleImpl();
        multiple.print();
        multiple.show();
    }
}

abstract class Bike1 {
    abstract void run();
}

class Honda1 extends Bike1 {
    void run() {
        System.out.println("running safely");
    }
}

class PrintableImpl implements Printable {
    public void print() {
        System.out.println("Hello");
    }
}

//    multiple inheritance in java
class MultipleImpl implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }
}
