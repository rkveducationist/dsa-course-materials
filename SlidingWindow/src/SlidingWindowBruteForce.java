public class SlidingWindowBruteForce {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int maxSum = 0;

        for (int i = 0; i <= (arr.length - k); i++) {

            int currentSum = 0;

            for (int j = i; j < (i + k); j++) {
                currentSum += arr[j];
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum Sum: " + maxSum);
    }
}