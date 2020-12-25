package Collections;

import java.util.*;

public class JiHeTest {
    public static void main(String[] args) {

        List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());

        Map<Integer, String> maps = Collections.synchronizedMap(new HashMap<Integer, String>());
        
    }
}
