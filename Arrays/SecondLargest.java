public class SecondLargest {
    // find second largest number without using sorting
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 89, 12};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest element: " + secondLargest);
    }
}
