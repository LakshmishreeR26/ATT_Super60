import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap <String, String> hm1 = new HashMap<>();
        hm1.put("01", "xxxxxx");
        hm1.put("03", "aaaaaa");
        hm1.put("02", "bbbbbb");
        hm1.put("05", "cccccc");
        hm1.put("04", "dddddd");
        System.out.println("Iterating over hashmap:");
        for(Map.Entry<String,String> entry : hm1.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //We use LinkedHashMap to maintain inserion order
        HashMap <String, String> hm2 = new LinkedHashMap<>();
        hm2.put("01", "xxxxxx");
        hm2.put("03", "aaaaaa");
        hm2.put("02", "bbbbbb");
        hm2.put("05", "cccccc");
        hm2.put("04", "dddddd");
        System.out.println("Iterating over Linked hashmap:");
        for(Map.Entry<String,String> entry : hm2.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
