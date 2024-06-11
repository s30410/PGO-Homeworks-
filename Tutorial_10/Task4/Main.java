import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArray(array);
        System.out.println("Array contents:");
        for (int value : array) {
            System.out.println(value);
        }
    }
    public static int readNumber () throws NegativeNumberException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entr a number");
        int number = scanner.nextInt();
        if (number < 0) {
            throw  new NegativeNumberException("Negative numbers are not allowed");


        }
        return number;
    }



    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = readNumber();
            } catch (NegativeNumberException e) {
                array[i] = 0;
                System.out.println(e.getMessage());
            }
        }
    }
}