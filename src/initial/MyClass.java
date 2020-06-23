package initial;

import initial.child.ClassWithStaticMembers;

import static initial.child.ClassWithStaticMembers.sayHi;

public class MyClass {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //commented lines do not execute

        //the below is a single line comment
        //System.out.println("Hi!");

        //the below is a multiline line comment
        /*
        System.out.println("Hi!");
        System.out.println("Bye!");
        */

//        if we need to use some code from other classes we can use imports
//        usually the class is imported and then we can access it's properties
        System.out.println(ClassWithStaticMembers.HI);
//        if the member is static can use static import instead
        System.out.println(sayHi());

    }
}
