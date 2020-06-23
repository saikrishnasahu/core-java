package constructor;

public class Constructor {

    public static void main(String[] args) {
//       calling a default constructor
        Bike b = new Bike();

        //creating objects
        Student s1 = new Student();
        Student s2 = new Student();
//       displaying values of the object
        s1.display();
        s2.display();

        Student s3 = new Student(111, "Karan");
        Student s4 = new Student(222, "Aryan");
        //calling method to display the values of object
        s3.display();
        s4.display();
    }
}

class Bike {
    //creating a default constructor
    Bike() {
        System.out.println("Bike is created");
    }
}

class Student {
    int id;
    String name;

    //    here both types of constructor is used so constructor overloading is achieved
    Student() {

    }

    Student(int i, String n) {
        id = i;
        name = n;
    }

    //method to display the value of id and name
    void display() {
        System.out.println(id + " " + name);
    }
}
