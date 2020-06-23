package staticExample;

public class StaticExample {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo");
        Car car2 = new Car("Ford");

//        even though we set the value with car1
//        should not use instance variables i.e. car1, car2
//        Car.setEngine("Car Engine");
        Car.setEngine("Car Engine");
        System.out.println(car1.getName());
        System.out.println(Car.getEngine());

        System.out.println(car2.getName());
//        we get the value from car2 as engine is class level
        System.out.println(Car.getEngine());

    }
}

class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        public static final Singleton instance = new Singleton();
    }
}

class Car {

    private static String engine;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public static String getEngine() {
        return engine;
    }

    public static void setEngine(String engineType) {
        engine = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
