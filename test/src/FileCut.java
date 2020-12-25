import java.io.*;

public class FileCut {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("D:\\Document\\健康码.jpg");
            OutputStream outputStream = new FileOutputStream("src/j1805.jpg");
            byte[] zhutong = new byte[5];
            int length;
            while ((length = inputStream.read(zhutong)) != -1) {
                outputStream.write(zhutong, 0, length);
            }
            inputStream.close();
            outputStream.close();
            //File file = new File("D:\\Document\\健康码.jpg");
            //file.delete();
        } catch (Exception e) {

        }
    }
}
