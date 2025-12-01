// given an interger array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums [i] == nums[j] and abs(i - j) <=k. by bruteforce apporach



public class ContainsNearbyDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // Check every pair of elements
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if values are equal and indices difference <= k
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        // No such pair found
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;

        System.out.println(containsNearbyDuplicate(nums1, k1)); // true
        System.out.println(containsNearbyDuplicate(nums2, k2)); // true
        System.out.println(containsNearbyDuplicate(nums3, k3)); // false
    }
}
