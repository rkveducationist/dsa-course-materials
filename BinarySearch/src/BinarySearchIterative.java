public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};

        int target = 17;

        int low = 0;
        int high = arr.length - 1;

        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at Index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found!");
        }
    }
}