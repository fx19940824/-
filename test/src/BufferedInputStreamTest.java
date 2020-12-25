import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class BufferedInputStreamTest {
    public static void main(String[] args) {
        try (
                InputStream inputStream = new FileInputStream("src/j1805.jpg");
                BufferedInputStream bufferIn = new BufferedInputStream(inputStream);

        ) {
            long startTimeL = System.currentTimeMillis();
            while (bufferIn.read() != -1) {

            }
            long endTimeL = System.currentTimeMillis();
            System.out.println(endTimeL - startTimeL);
        } catch (Exception e) {

        }
    }
}
