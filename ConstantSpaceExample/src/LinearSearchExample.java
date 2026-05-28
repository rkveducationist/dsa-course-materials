public class LinearSearchExample {
    public static void main(String[] args) {
        int n = 5;

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }

        for (int num: numbers) {
            System.out.println("num: " + num);
        }
    }
}
