package protectedExample.pack2;

import protectedExample.pack1.A;

class D extends A {
    void methodOfClassD() {
        System.out.println(i);        //Protected field can be inherited to any sub class

        A a = new A();
        //System.out.println(a.i);     Protected field can not be used outside the package
        //a.methodOfClassA();          Protected method can not be used outside the package
        //A.B b = new A.B();           Protected inner class can not be used outside the package
    }
}
