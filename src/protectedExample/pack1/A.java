package protectedExample.pack1;

public class A {
    protected int i;

    protected void methodOfClassA() {
        //Protected method
        System.out.println(i); //Protected field can be used within class
        B b = new B();         //Protected Inner Class can be used within class.
    }

    protected class B {
        //Protected Inner Class
    }
}

class C extends A {
    void methodOfClassC() {
        System.out.println(i);        //Protected field can be inherited to any sub class

        A a = new A();
        System.out.println(a.i);     //Protected field can be used within the package
        a.methodOfClassA();          //Protected method can be used within the package
        A.B b = new A.B();           //Protected Inner Class can be used within the package
    }
}
