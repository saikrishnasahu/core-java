package enumAnnotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

// Using target annotation to annotate a type
@Target(ElementType.TYPE_USE)
// Declaring a simple type annotation
@interface TypeAnnotationDemo {
}

// Make Words annotation repeatable
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface Words {
    String word() default "Hello";

    int value() default 0;
}

// Create container annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    Words[] value();
}

// user-defined annotation
@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnotation {
    String Developer() default "Rahul";

    String Expirydate();
} // will be retained at runtime

public class AnnotationExample {

    // Repeat Words on newMethod
    @Words(word = "First", value = 1)
    @Words(word = "Second", value = 2)
    public static void newMethod() {
        AnnotationExample obj = new AnnotationExample();

        try {
            Class<?> c = obj.getClass();

            // Obtain the annotation for newMethod
            Method m = c.getMethod("newMethod");

            // Display the repeated annotation
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        } catch (NoSuchMethodException e) {
            System.out.println(e);
        }
    }

    // If we comment below annotation, program generates
    // warning
    @SuppressWarnings({"checked", "deprecation"})
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.display();

        // Annotating the type of a string
        @TypeAnnotationDemo String string = "I am annotated with a type annotation";
        System.out.println(string);
        abc();

        newMethod();

        AnnotationExample d1 = new AnnotationExample();
        d1.display();
    }

    // Annotating return type of a function
    static @TypeAnnotationDemo int abc() {
        System.out.println("This function's  return type is annotated");
        return 0;
    }

    @TestAnnotation(Developer = "Rahul", Expirydate = "01-10-2020")
    void fun1() {
        System.out.println("Test method 1");
    }

    @TestAnnotation(Developer = "Anil", Expirydate = "01-10-2021")
    void fun2() {
        System.out.println("Test method 2");
    }

    @Deprecated
    public void display() {
        System.out.println("Deprecated test display()");
    }
}

/*
   Java program to demonstrate that annotations are
   not barely comments (This program throws compiler
   error because we have mentioned override, but not
   overridden, we have overloaded display)
*/
class Base {
    public void display() {
        System.out.println("Base display()");
    }
}

class Derived extends Base {

//    @Override
//    public void display(int x) {
//        System.out.println("Derived display(int )");
//    }

}
