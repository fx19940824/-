import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) {
        try (
                PrintStream printStream = new PrintStream("src/j1804.txt")
                ) {
            printStream.print(true);
            printStream.print("abc广州");
            printStream.print(97);
            printStream.print('b');
            System.out.println();
            printStream.flush();
        } catch (Exception e) {

        }
    }
}
