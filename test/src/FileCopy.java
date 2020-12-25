import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
    public static void main(String[] args) {
        try (
                InputStream inputStream = new FileInputStream("src/j1804.txt");
                OutputStream outputStream = new FileOutputStream("src/j1806.txt");
        ) {
            byte[] zhutong = new byte[5];
            int length;
            while ((length = inputStream.read(zhutong)) != -1) {
                outputStream.write(zhutong, 0, length);
            }
        } catch (Exception e) {

        }
    }
}
