public class BasicRecursion {
    public static void printNumbers(int n) {
        // base case
        if (n == 0) {
            return;
        }

        // recursive call
        printNumbers(n - 1);

        // result
        System.out.println("n: " + n);
    }

    public static void main(String[] args) {
        int n = 5;

        printNumbers(n);
    }
}