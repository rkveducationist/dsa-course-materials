public class LinearTimeExample {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 50, 65, 70};

        int target = 50;

        boolean found = false;

        for (int i = 0; i <numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("element not found!");
        }
    }
}
