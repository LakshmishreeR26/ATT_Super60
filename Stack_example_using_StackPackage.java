import java.util.Stack;
public class Stack_example {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Mango");
        stack.push("Litchi");
        stack.push("Watermelon");
        System.out.println("Stack: "+stack);
        String popped = stack.pop();
        System.out.println("Popped item: "+popped);
        System.out.println("Current Size: "+stack.size());
    }
}
