package object;

public class GarbageCollection {

    public static void main(String[] args) {
        Integer i = 4;
// the new Integer object is reachable  via the reference in 'i'
        i = null;
// the Integer object is no longer reachable. garbage collection

        Test t1 = new Test();
        Test t2 = new Test();

        // Nullifying the reference variable
        t1 = null;

        // requesting JVM for running Garbage Collector
        System.gc();

        // Nullifying the reference variable
        t2 = null;

        // requesting JVM for running Garbage Collector
        Runtime.getRuntime().gc();
    }


}

class Test {
    @Override
    // finalize method is called on object once
    // before garbage collecting it
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected : " + this);
    }
}