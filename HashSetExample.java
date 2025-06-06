import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> names = new LinkedHashSet<>();
        names.add("John");
        names.add("Jane");
        names.add("John");
        names.add("Mary");
        names.add("Bob");
        names.add("Mary");
        HashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(1);
        numbers.add(12);
        numbers.add(1);
        numbers.add(13);
        System.out.println(names);
        System.out.println(numbers);
        System.out.println(names.contains("Bob"));
        names.clear();
        System.out.println(names.isEmpty());

    }
}
