public class PrefixSumOptimized {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        int n = arr.length; // 5

        int[] prefix = new int[n];

        // step1: build prefix array
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
            // 4 times
            // prefix[1] = 6
            // prefix[2] = 12
            // prefix[3] = 20
            // prefix[4] = 30
        }

        // query
        int L = 1;
        int R = 3;

        int sum = 0;

        if (L == 0) {
            sum = prefix[R];
        } else {
            sum = prefix[R] - prefix[L - 1]; // sum = 18
        }

        System.out.println("Sum: " + sum);
    }
}