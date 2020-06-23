package object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class ObjectCreationExample {

    public static void main(String[] args) {
        A a = new A();  //creating object using new keyword
        System.out.println(a.str);

        try {//creating object of class
            NewInstanceExample obj = NewInstanceExample.class.newInstance();
            System.out.println(obj.str);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Constructor<NewInstanceExample1> obj = NewInstanceExample1.class.getConstructor();
            NewInstanceExample1 obj1 = obj.newInstance();
            System.out.println(obj1.str);
        } catch (Exception e) {
            e.printStackTrace();
        }

        CloneExample obj1 = new CloneExample();     //creating object of class
        try {
            CloneExample obj2 = (CloneExample) obj1.clone();
            System.out.println(obj1.name);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Demo object = new Demo(8, "javatpoint");
        String filename = "Demofile.ser";       //specified file name (must have extension .ser)
        /*-----------------Serialization----------*/
        try {
            FileOutputStream file = new FileOutputStream(filename);  //Saving of object in the file
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);            //serialize object
            out.close();                    //closes the ObjectOutputStream
            file.close();                   //closes the file
            System.out.println("Object serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Demo obj = null;
        /*-----------------Deserialization--------*/
        try {
            FileInputStream file = new FileInputStream(filename); // reading an object from a file
            ObjectInputStream is = new ObjectInputStream(file);
            obj = (Demo) is.readObject();        //deserialize object
            is.close();                     //closes the ObjectInputStream
            file.close();                   //closes the file
            System.out.println("Object deserialized ");
            System.out.println("number = " + obj.i);
            System.out.println("string = " + obj.s);
        } catch (IOException e) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}

class A {
    String str = "hello";
}

class NewInstanceExample {
    String str = "hello";
}

class NewInstanceExample1 {
    String str = "hello";
}

class CloneExample implements Cloneable {
    String name = "Microprocessor";

    //creates and returns a copy of this object
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

class Demo implements Serializable {
    public int i;
    public String s;

    public Demo(int i, String s) //default constructor
    {
        this.i = i;
        this.s = s;
    }
}