package datatypesLiterals;

public class MyClass {

    //    myStaticInt is a static variable
    static int myStaticInt = 19;
    //    myLocalInt is a instance variable
    int myLocalInt = 10;

    public static void main(String[] args) {

//        byte, short, etc are data types
//        myByte, myBoolean, etc are local variables as they are declared within method
//        10, 5000, 'D', etc are literals
        byte myByte = 10;
        short myShort = 5000;
        int myInt = 100000;
        long myLong = 15000000000L;
        float myFloat = 5.99f;
        double myDouble = 19.99d;
        char myChar = 'D';
        boolean myBoolean = true;
        String myString = "Hello";

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myString);

        char a = 65, b = 66, c = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int decimalInt = 100;
        int octalInt = 0144;
        int hexadecimalInt = 0x64;
        System.out.println(decimalInt);
        System.out.println(octalInt);
        System.out.println(hexadecimalInt);

        String helloWorld = "Hello World";
        String twoLines = "two\nlines";
        String inQuotes = "\"This is in quotes\"";
        System.out.println(helloWorld);
        System.out.println(twoLines);
        System.out.println(inQuotes);

        char aChar = '\u0001';
        String aString = "\u0001";
        System.out.println(aChar);
        System.out.println(aString);

        int aInt = 10;
        int bInt = 10;
        int cInt = aInt + bInt;
        System.out.println(cInt);
    }
}
