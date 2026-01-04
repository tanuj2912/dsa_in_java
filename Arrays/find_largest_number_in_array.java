public class find_largest_number_in_array {
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 89, 12};

        int largest = arr[0]; // assume first element is largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element in the array is: " + largest);
    }
}
