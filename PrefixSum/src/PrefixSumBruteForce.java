public class PrefixSumBruteForce {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        int L = 1;
        int R = 3;

        int sum = 0;

        for (int i = L; i <= R; i++) {
            sum += arr[i]; // sum = 18
        }

        System.out.println("Sum: " + sum);
    }
}