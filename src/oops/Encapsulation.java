package oops;

public class Encapsulation {
    public static void main(String[] args) {
//creating instance of the encapsulated class
        Student s = new Student();
//setting value in the name member
        s.setName("vijay");
//getting value of the name member
        System.out.println(s.getName());

        ReadOnlyStudent r = new ReadOnlyStudent();
        System.out.println(r.getCollege());

        WriteOnlyStudent w = new WriteOnlyStudent();
        w.setCollege("Vijay");
    }
}

class Student {
    //private data member
    private String name;

    //getter method for name
    public String getName() {
        return name;
    }

    //setter method for name
    public void setName(String name) {
        this.name = name;
    }
}


//Read-Only class
//A Java class which has only getter methods.
class ReadOnlyStudent {
    //private data member
    private final String college = "AKG";

    //getter method for college
    public String getCollege() {
        return college;
    }
}

//Write-Only class
//A Java class which has only setter methods.
class WriteOnlyStudent {
    //private data member
    private String college;

    //getter method for college
    public void setCollege(String college) {
        this.college = college;
    }
}
