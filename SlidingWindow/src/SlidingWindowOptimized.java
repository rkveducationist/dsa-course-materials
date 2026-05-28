public class SlidingWindowOptimized {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int windowSum = 0;
        int maxSum = 0;

        // step 1: calculate first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i]; // 2, 1, 5
        }

        maxSum = windowSum;

        // step 2: slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Maximum Sum: " + maxSum);
    }
}