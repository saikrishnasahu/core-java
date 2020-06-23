package block;

public class Block {
    public static void main(String[] args) {

        // Although we don't have an object of Test, static block is
        // called because i is being accessed in following statement.
        System.out.println(Test.i);

        // Although we have two objects, static block is executed only once.
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();

        GfG a = new GfG();
    }
}

class Test {
    static int i;

    // start of static block
    static {
        i = 10;
        System.out.println("static block called ");
    }

    int j;
    // end of static block
}

class Test1 {
    static int i;

    static {
        i = 10;
        System.out.println("static block called ");
    }

    int j;

    Test1() {
        System.out.println("Constructor called");
    }
}

class GfG {
    // Instance Initialization Block - 1
    {
        System.out.println("IIB1 block");
    }

    // Instance Initialization Block - 2
    {
        System.out.println("IIB2 block");
    }

    // Constructor of GfG class
    GfG() {
        System.out.println("Constructor Called");
    }

}
