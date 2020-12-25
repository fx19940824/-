import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileTest {
    public static void main(String[] args) {
        /*File file = new File("D:\\j1217.txt");
        System.out.println("file readable: " + file.canRead());
        System.out.println("file writable: " + file.canWrite());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.isHidden());
        System.out.println("文件内容大小" + file.length());
        try{
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        try (OutputStream outputStream = new FileOutputStream("src/j1804.txt")){

        } catch (Exception e) {

        }
    }
}
