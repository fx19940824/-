import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author FangXin
 * @version 1.0
 */
public class Application {

    public static int A(int i, int j) {
        try {
            return i/j;
        } catch (Exception e) {
            return 0;
        } finally {
            return 1;
        }
    }

    public static class Stu {
        private String name;

        public Stu(String name){
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Stu stu = (Stu) o;
            return Objects.equals(name, stu.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    public static void main(String[] args) {

        /*List list = new ArrayList();
        list.add(1);
        list.add("sdf");*/

        Set set = new HashSet();
        set.add(200);
        set.add(200);

        Stu s1 = new Stu("A");
        Stu s2 = new Stu("A");
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());

        Map<String, String> maps = new HashMap<>();
        Set<Map.Entry<String, String>> entry = maps.entrySet();

        int num = A(10, 2);

        Properties p = System.getProperties();
        p.list(System.out);
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.totalMemory() + " " + rt.freeMemory());

        List<String> strs = new ArrayList<>();
        strs.add("a");
        strs.add("b");
        strs.add("c");
        for (String str : strs) {
            str = "d";
        }

        Long timeStamp = System.currentTimeMillis();
        Date datetest = new Date(Long.parseLong(String.valueOf(timeStamp)));
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long result = datetest.getTime();

        long entryTimeL = //1594903673783l;
                //1594976508000l;
                //1594983708000l
                //1594947708000l;
                //1594954908000l;
                1594915200000l;
        String entryTime = "2020-07-17 09:01:48";

        //DateUtil dc = new DateUtil();
        //dc.setTimel(entryTimeL);
        //System.out.println(dc.getTime());
        //dc.setTime(entryTime);
        //System.out.println(dc.getLocalTimel());

        //dc.getTimeZone();

        String datetime = "20200730123042";
        Date date = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        try{
            date = format.parse(datetime);
        } catch (Exception e) {

        }

        System.out.println(date);
    }
}