package privateExample;

class A {
    private int i;

    private void methodOfClassA() {
        //Private Method
        System.out.println(i);  //Private field can be used within class
        B b = new B();          //Private inner class can be used within class
    }

    private class B {
        //Private Inner Class
    }
}

class C extends A {
    void methodOfClassC() {
        //System.out.println(i);  Private member can not be inherited
        A a = new A();
        //System.out.println(a.i);     Private field can not be used outside the class
        //a.methodOfClassA();          Private method can not be used outside the class
        //A.B b = new A.B();           Private inner class can not be used outside the class
    }
}
