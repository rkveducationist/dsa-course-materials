public class MergeSort {

    // mergeSort()
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // divide
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // merge
            merge(arr, left, mid, right);
        }
    }

    // merge()
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // copy data
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // merge arrays
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // copy remaining elements
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1};

        System.out.println("before merge sort:");
        for (int num: arr) {
            System.out.println(num + "");
        }

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("after merge sort:");
        for (int num: arr) {
            System.out.println(num + "");
        }
    }
}