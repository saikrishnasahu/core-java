package nonStaticExample;

public class NonStaticExample {

    public static void main(String[] args) {
        A.staticVariable = 10;
        //   A.nonStaticVariable = 10;
        A.staticMethod();
        //    A.nonStaticMethod();

        A a1 = new A();
        A a2 = new A();

        System.out.println(a1.nonStaticVariable);
        System.out.println(A.staticVariable);
        a1.nonStaticMethod();
        A.staticMethod();

        System.out.println(A.staticVariable);
        A.staticVariable = 20;
        System.out.println(A.staticVariable);
    }
}

class A {
    static int staticVariable;
    int nonStaticVariable;

    static void staticMethod() {
        System.out.println(staticVariable);
        //   System.out.println(nonStaticVariable);
    }

    void nonStaticMethod() {
        System.out.println(staticVariable);
        System.out.println(nonStaticVariable);
    }
}
