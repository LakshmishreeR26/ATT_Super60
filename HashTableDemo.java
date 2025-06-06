import java.util.Hashtable;
import java.util.Map;
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106,"Dog");
        ht.put(117,"Cat");
        ht.put(128,"Parrot");
        ht.put(100,"Fish");
        ht.put(99,"Rabbit");
        for(Map.Entry<Integer,String> entry : ht.entrySet()){
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
    }
}
