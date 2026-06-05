import java.util.Stack;

public class StackBasic {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // all elements
        System.out.println("All Stack Elements: " + stack);

        // top element
        System.out.println("Top Element: " + stack.peek());

        // remove element
        stack.pop();

        System.out.println("After Pop, The Top Element: " + stack.peek());

        // all elements
        System.out.println("All Stack Elements: " + stack);
    }
}