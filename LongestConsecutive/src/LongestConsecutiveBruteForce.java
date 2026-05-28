public class LongestConsecutiveBruteForce {
    public static boolean contains(int[] arr, int target) {
        for (int num: arr) {
            if (num == target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        int longest = 0;

        for (int num: arr) {
            int currentNum = num;
            int count = 1;

            while (contains(arr, currentNum + 1)) {
                currentNum++;
                count++;
            }

            longest = Math.max(longest, count);
        }

        System.out.println("Longest Sequence Length: " + longest);
    }
}