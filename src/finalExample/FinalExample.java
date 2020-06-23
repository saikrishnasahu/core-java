package finalExample;

public class FinalExample {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.change();
    }
}

class Bike {
    static final int data;//static blank final variable

    static {
        data = 50;
    }

    final int speedLimit = 90;//final variable
    //    although final can only be initialized in constructor
    final int numberOfGears;

    Bike() {
        this.numberOfGears = 5;
    }

    void change() {
//        cannot change as final
//        speedLimit=400;
    }

    final void run() {
        System.out.println("running");
    }
}

class Honda extends Bike {
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }

//    cannot override as the method in parent class is final
//    void run() {
//        System.out.println("running safely with 100kmph");
//    }
}

final class FinalBike {
}

// cannot extend as the class is final
//class Honda1 extends FinalBike {
//    void run() {
//        System.out.println("running safely with 100kmph");
//    }
//}
