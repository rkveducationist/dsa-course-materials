public class SearchElementExample {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};

        int target = 15;

        boolean found = false;

        for (int num: numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element Found!" + target);
        } else {
            System.out.println("Element Not Found!" + target);
        }
    }
}
