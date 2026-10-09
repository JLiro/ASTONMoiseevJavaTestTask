import java.io.PrintStream;

/**
 * Задание 3: вывод чётных чисел из заданного массива.
 */
public final class EvenNumbersApp {
    private static final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private EvenNumbersApp() {
    }

    public static void main(String[] args) {
        printEvenNumbers(System.out);
    }

    static void printEvenNumbers(PrintStream output) {
        for (int number : NUMBERS) {
            if (number % 2 == 0) {
                output.println(number);
            }
        }
    }
}
