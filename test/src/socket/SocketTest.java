package socket;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("99.1.188.107", 9999);
            Thread.sleep(10000);
            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("HELLO ");
            dataOutputStream.flush();
        } catch (Exception e) {

        }
    }
}
