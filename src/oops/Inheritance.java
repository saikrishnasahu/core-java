package oops;

public class Inheritance {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);

        Manager m = new Manager();
        System.out.println("Manager salary is:" + m.salary);
        System.out.println("Bonus of Manager is:" + m.bonus);

        JavaProgrammer j = new JavaProgrammer();
        System.out.println("Java Programmer salary is:" + j.salary);
        System.out.println("Java Programmer skill is:" + j.skill);
        System.out.println("Java Programmer bonus is:" + j.bonus);
    }
}

class Employee {
    float salary = 40000;
}

//single Inheritance
class Programmer extends Employee {
    int bonus = 10000;
}

//Hierarchical Inheritance
class Manager extends Employee {
    int bonus = 20000;
}

//Multilevel Inheritance
class JavaProgrammer extends Programmer {
    String skill = "Java";
}

// multiple Inheritance
class A {
    void msg() {
        System.out.println("Hello");
    }
}

class B {
    void msg() {
        System.out.println("Welcome");
    }
}
//compilation issue
//class C extends A,B{//suppose if it were
//
//    public static void main(String args[]){
//        C obj=new C();
//        obj.msg();//Now which msg() method would be invoked?
//    }
//}
