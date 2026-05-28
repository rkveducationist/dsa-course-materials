public class SubArraySumBruteForce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int k = 12;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                // System.out.println("sum: " + sum);

                if (sum == k) {
                    found = true;
                    break;
                }
            }
        }

        if (found) {
            System.out.println("Subarray Found!");
        } else {
            System.out.println("Not Found!");
        }
    }
}