public class FindMaximumExample {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 5, 40, 15};

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum value: " + max);
    }
}
