package datatypesLiterals;

public class TypeConversionCastingPromotion {

    public static void main(String[] args) {
        int i = 100;

        // automatic type conversion
        long l = i;

        // automatic type conversion
        float f = l;
        System.out.println("Int value " + i);
        System.out.println("Long value " + l);
        System.out.println("Float value " + f);

        char ch = 'c';
        int num = 88;
//        cannot as this gives compilation issue
//        ch = num;

        double d = 100.04;

        //explicit type casting
        l = (long) d;

        //explicit type casting
        i = (int) l;
        System.out.println("Double value " + d);

        //fractional part lost
        System.out.println("Long value " + l);

        //fractional part lost
        System.out.println("Int value " + i);

        byte b;
        i = 257;
        d = 323.142;
        System.out.println("Conversion of int to byte.");

        //i%256
        b = (byte) i;
        System.out.println("i = " + i + " b = " + b);
        System.out.println("\nConversion of double to byte.");

        //d%256
        b = (byte) d;
        System.out.println("d = " + d + " b= " + b);

        b = 42;
        char c = 'a';
        short s = 1024;
        i = 50000;
        f = 5.67f;
        d = .1234;

        // The Expression
        double result = (f * b) + (i / c) - (d * s);

        //Result after all the promotions are done
        System.out.println("result = " + result);

        b = 50;

        //type casting int to byte
        b = (byte) (b * 2);
        System.out.println(b);
    }
}
