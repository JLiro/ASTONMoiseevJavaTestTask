import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Задание 1: сравнение двух целых чисел и арифметические операции над ними.
 */
public final class NumberOperationsApp {
    private NumberOperationsApp() {
    }

    public static void main(String[] args) throws IOException {
        run(System.in, System.out);
    }

    static void run(InputStream input, PrintStream output) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));

        output.println("Введите целое число a:");
        String firstLine = reader.readLine();
        output.println("Введите целое число b:");
        String secondLine = reader.readLine();

        if (firstLine == null || secondLine == null) {
            output.println("Ошибка: нужно ввести два целых числа.");
            return;
        }

        final int a;
        final int b;
        try {
            a = Integer.parseInt(firstLine.trim());
            b = Integer.parseInt(secondLine.trim());
        } catch (NumberFormatException exception) {
            output.println("Ошибка: a и b должны быть целыми числами в диапазоне int.");
            return;
        }

        output.println(compare(a, b));
        output.println("Сложение: " + (a + b));
        output.println("Вычитание: " + (a - b));
        if (b == 0) {
            output.println("Деление: невозможно (деление на ноль).");
        } else {
            output.println("Деление: " + ((double) a / b));
        }
        output.println("Умножение: " + (a * b));
    }

    static String compare(int a, int b) {
        if (a > b) {
            return "a > b";
        }
        if (a < b) {
            return "a < b";
        }
        return "a = b";
    }
}
