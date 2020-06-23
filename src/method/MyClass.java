package method;

public class MyClass {

    //    Create a method inside MyClass
//    myStaticMethod() is the name of the method
//    static means that the method belongs to the MyClass class and not an object of the MyClass class.
//    void means that this method does not have a return value.
    private static void myStaticMethod() {
        // code to be executed
        System.out.println("I just got executed!");
    }

    //    fname is a parameter
    private static void myStaticMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    //    multiple parameters
    private static void myStaticMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    private static int myStaticMethod(int x) {
        return 5 + x;
    }

    private static int myStaticMethod(int x, int y) {
        return x + y;
    }

    // Create a checkAge() method with an integer variable called age
    private static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static void main(String[] args) {
//        A method can also be called multiple times
//        since static can be called directly aas it is a member of a Class
//        can also be called using class name but since in same class it can be ignored
        MyClass.myStaticMethod();
        myStaticMethod();
        myStaticMethod();
        myStaticMethod();
        myStaticMethod();

//        Liam, Jenny and Anja are arguments
        myStaticMethod("Liam");
        myStaticMethod("Jenny");
        myStaticMethod("Anja");

//        here we can say the below method and above methods are over loaded as they all have same name as well as
//        either the number of parameters are different or their type is different
        myStaticMethod("Liam", 5);
        myStaticMethod("Jenny", 8);
        myStaticMethod("Anja", 31);

        System.out.println(myStaticMethod(3));
        System.out.println(myStaticMethod(5, 3));

        checkAge(20); // Call the checkAge method and pass along an age of 20

//        for calling non static methods, objects needs to created first
//        all other things remain similar as static
        MyClass myClass = new MyClass();
        myClass.myMethod();
    }

    private void myMethod() {
        System.out.println("A object needs to be created first. I just got executed!");
    }

}
