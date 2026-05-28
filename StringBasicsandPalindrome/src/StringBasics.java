public class StringBasics {
    public static void main(String[] args) {
        String name = "Rama";

        System.out.println("String: " + name);

        // length of string
        System.out.println("Length: " + name.length());

        // Access characters
        System.out.println("First Character: " + name.charAt(0));
        System.out.println("Last Character: " + name.charAt(name.length() - 1));
    }
}