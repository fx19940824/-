package 对象流;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/user.txt"))){
            
        } catch (Exception e) {

        }
    }
}
