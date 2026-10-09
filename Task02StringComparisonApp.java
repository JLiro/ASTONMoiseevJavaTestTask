import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Задание 2: сравнение двух строк, введённых пользователем.
 */
public final class StringComparisonApp {
    private StringComparisonApp() {
    }

    public static void main(String[] args) throws IOException {
        run(System.in, System.out);
    }

    static void run(InputStream input, PrintStream output) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));

        output.println("Введите строку a:");
        String a = reader.readLine();
        output.println("Введите строку b:");
        String b = reader.readLine();

        if (a == null || b == null) {
            output.println("Ошибка: нужно ввести две строки.");
            return;
        }

        output.println(compare(a, b));
    }

    static String compare(String a, String b) {
        return a.equals(b) ? "Строки идентичны" : "Строки неидентичны";
    }
}
