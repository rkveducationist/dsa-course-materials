import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void generateSubsets(int[] arr, int index, List<Integer> current) {
        // base case
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // include element
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current);

        // backtrack (remove the last element)
        current.remove(current.size() - 1);

        // exclude element
        generateSubsets(arr, index + 1, current);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};

        generateSubsets(arr, 0, new ArrayList<>());
    }
}