public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int[] arr = {2,  11, 7, 15};
        int target = 9;

        // Brute force approach
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Indices: " + i + ", " + j);
                }
            }
        }
    }
}
