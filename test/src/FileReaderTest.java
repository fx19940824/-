import java.io.*;

public class FileReaderTest {
    public static void main(String[] args) {
        try (
                Reader fileReader = new FileReader("src/j1804.txt");
                Writer fileWriter = new FileWriter("src/j1803.txt")) {
            char[] zhuTong = new char[10];
            int length;
            while ((length = fileReader.read(zhuTong)) != -1) {
                fileWriter.write(zhuTong, 0, length);
            }
        } catch (Exception e) {

        }
        try (
                InputStream inputStream = new FileInputStream("src/j1803.txt");
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8")
                ) {
            char[] zhuTong = new char[1024];
            int length;
            while ((length = inputStreamReader.read(zhuTong)) != -1) {
                String str = new String(zhuTong, 0, length);
                System.out.println(str);
            }
        } catch (Exception e) {

        }

    }
}
