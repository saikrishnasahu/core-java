package privateExample;

//private class D
//{
//    //Outer class Can not be private
//}

class D {
    private D() {
        //Private Constructor
    }

    private D(int i) {
        //Private constructor
    }
}

//class B extends D
//{
//    //Can't create subclass to the class
//    //which has only private constructors
//}
