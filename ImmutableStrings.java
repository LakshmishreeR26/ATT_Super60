public class ImmutableStrings {
    public static void main(String[] args) {
        String name = "BNMIT";
        System.out.println("Lower Case: " + name.toLowerCase()); //Copy
        System.out.println("Original String: " + name);

        StringBuffer buffer = new StringBuffer("JAVA");
        System.out.println("Original String:" + buffer);
        buffer.reverse();
        System.out.println("New String:" + buffer);
    }
}
