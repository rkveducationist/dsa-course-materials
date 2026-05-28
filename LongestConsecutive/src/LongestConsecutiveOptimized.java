import java.util.HashSet;

public class LongestConsecutiveOptimized {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set = new HashSet<>();

        // step1: add all elements to set
        for (int num: arr) {
            set.add(num);
        }

        System.out.println("set: " + set);

        int longest = 0;

        // step2: check for sequences
        for (int num: set) {
            // start only if it's the beginning
            if (!set.contains(num - 1)) {
                int currentNum = num;

                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        System.out.println("Longest consecutive length: " + longest);
    }
}