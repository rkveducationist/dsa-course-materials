public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1};

        int n = arr.length;

        System.out.println("before bubble sort array");

        for (int num: arr) {
            System.out.println(num + "");
        }

        System.out.println("-------------------------------------");

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("after bubble sort array");

        for (int num: arr) {
            System.out.println(num + "");
        }
    }
}