package arraysVarargs;

public class Array {

    public static void main(String[] args) {
//        To declare an array, define the variable type with square brackets:
        String[] arrays;

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (String i : cars) {
            System.out.println(i);
        }

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
