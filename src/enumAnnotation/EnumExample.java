package enumAnnotation;

// Declaring an Enum
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class EnumExample {

    public static void main(String[] args) {
//        accessing an enum
        Level level = Level.HIGH;
        System.out.println(level);

        InsideClassLevel myVar = InsideClassLevel.MEDIUM;
        System.out.println(myVar);

        level = Level.MEDIUM;
//       enum in switch case
        switch (level) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

//        looping through values of enum
        for (Level l : Level.values()) {
            System.out.println(l);
        }
    }

    //Enum inside a Class
    enum InsideClassLevel {
        LOW,
        MEDIUM,
        HIGH
    }
}
