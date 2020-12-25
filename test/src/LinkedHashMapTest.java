import java.io.FileInputStream;
import java.util.*;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("0001", "software");
        map.put("0002", "xingzheng");
        map.put("0003", "bussiness");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }

        LinkedList<String> queue = new LinkedList<>();
        /*queue.offer("jack");
        queue.offer("rose");
        queue.offer("tom");
        System.out.println(queue);
        queue.peek();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);*/

        queue.push("jack");
        queue.push("rose");
        queue.push("tom");
        System.out.println(queue);
        String name = queue.pop();
        System.out.println(name + "=====" + queue);
        //queue.poll();
        //System.out.println(queue);
        //queue.pop();
        //System.out.println(queue);

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/jdbc.properties"));
            for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        } catch (Exception e) {

        }
    }

}
