package classExample;

import java.util.Scanner;

public class ClassExample {// Concrete Class

    static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int p = product(2, 3);
        System.out.println("Product: " + p);

        Animal a = new Dog();
        a.sound();

        POJO pojo = new POJO();
        System.out.println(pojo.getValue());

        StaticClasses.MyNestedClass mnc = new StaticClasses.MyNestedClass(); // object for static class
        mnc.display(); // accessing methods inside a static class
    }

    class InnerClass {// Inner Class

        public void inner_print() {
            System.out.println("Inner");
        }
    }

}

class StaticClasses {
    static int s; // static variable

    static void met(int a, int b) { // static method
        System.out.println("static method to calculate sum");
        s = a + b;
        System.out.println(a + "+" + b); // print two numbers
    }

    static class MyNestedClass { // static class
        static { // static block
            System.out.println("static block inside a static class");
        }

        public void display() {
            int c, d;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two values");
            c = sc.nextInt();
            d = sc.nextInt();
            met(c, d); // calling static method
            System.out.println("Sum of two numbers-" + s); // print the result in static variable
        }
    }
}


class POJO {
    private int value = 100;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

final class BaseClass {
    void Display() {
        System.out.print("This is Display() method of BaseClass.");
    }
}
//class DerivedClass extends BaseClass { //Compile-time error - can't inherit final class
//    void Display() {
//        System.out.print("This is Display() method of DerivedClass.");
//    }
//}

abstract class Animal { //abstract parent class
    public abstract void sound(); //abstract method
}

class Dog extends Animal { //Dog class extends Animal class
    public void sound() {
        System.out.println("Woof");
    }
}
