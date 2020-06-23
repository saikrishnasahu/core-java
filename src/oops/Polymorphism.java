package oops;

public class Polymorphism {
    public static void main(String[] args) {
        Bike b = new Splendor();//upcasting
        b.run();
        Bike honda = new Honda();
        System.out.println(honda.speedLimit);//90
    }
}

class Bike {
    int speedLimit = 90;

    void run() {
        System.out.println("running");
    }
}

class Splendor extends Bike {
    void run() {
        System.out.println("running safely with 60km");
    }
}

class Honda extends Bike {
    int speedLimit = 150;
}
