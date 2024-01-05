package ex13;
// ex07
import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("kim", "1234");
        map.put("park", "pass");
        map.put("lee", "word");

        System.out.println(map.get("lee"));

        for (String key : map.keySet()){
            String value = map.get(key);
            System.out.println("key="+key+",value="+value);
        }
        map.remove(3);
        // to remove an element by its key, ensure that the key matches the type of the keys in the map.
        // e.g. map.remove("lee");
        map.put("choi", "password");
        System.out.println(map);
    }
}
