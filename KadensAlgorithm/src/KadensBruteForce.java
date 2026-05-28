public class KadensBruteForce {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int n = arr.length;
        // System.out.println("No. of Elements: " + n);

        int maxSum = Integer.MIN_VALUE;
        // System.out.println("What's the value of maxSum: " + maxSum);

        // System.out.println("-----------------------------------");
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;

            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                // System.out.println("currentSum: " + (currentSum) + " -> arr[" + j + "]" + (arr[j]));
                maxSum = Math.max(maxSum, currentSum);

                //System.out.println("Loop by Loop currentSum: " + currentSum);
                //System.out.println("Loop by Loop maxSum: " + maxSum);
            }
        }

        // System.out.println("-----------------------------------");
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}