package designPattern.creational.singleton;

public class Singleton {
    public static void main(String[] args) {
        B b = B.getB();
        C c = C.getC();
    }
}

class B {
    private static B obj;

    private B() {
    }

    public static B getB() {
        if (obj == null) {
            synchronized (B.class) {
                if (obj == null) {
                    obj = new B();//instance will be created at request time
                }
            }
        }
        return obj;
    }
}


class C {
    private static final C obj = new C();//Early, instance will be created at load time

    private C() {
    }

    public static C getC() {
        return obj;
    }
}

