import java.util.HashSet;

public class SubArraySumOptimized {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int k = 12;

        HashSet<Integer> set = new HashSet<>();

        int currentSum = 0;
        boolean found = false;

        for (int num: arr) {
            currentSum += num;

            if (currentSum == k || set.contains(currentSum - k)) {
                found = true;
                break;
            }

            set.add(currentSum);
        }

        if (found) {
            System.out.println("Subarray Found!");
        } else {
            System.out.println("Not Found!");
        }
    }
}