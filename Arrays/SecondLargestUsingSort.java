import java.util.Arrays;

public class SecondLargestUsingSort {
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 89, 12};

        Arrays.sort(arr);   // sort array in ascending order

        int n = arr.length;
        int secondLargest = arr[n - 2];

        System.out.println("Second largest element: " + secondLargest);
    }
}
