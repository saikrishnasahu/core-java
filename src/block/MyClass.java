package block;

public class MyClass {
    public static void main(String[] args) {
//        here the method is invoked
        MyClass.myMethod();
//        here Test class is initialized by invoking constructor
        TestClass test = new TestClass();
//        upon execution the System.out.println methods run and print to console
    }

    //    this is a method definition
    public static void myMethod() {
        System.out.println("myMethod is executed");
    }
}

//    this is a class definition
class TestClass {

    TestClass() {
        System.out.println("Test is initialized");
    }
}

