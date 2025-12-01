// given two string s and t, return true if t is anagram of s, and false otherwise

import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String s, String t) {
        // If lengths are different, they can't be anagrams
        if (s.length() != t.length()) return false;

        // Convert strings to char arrays
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        // Sort both arrays
        Arrays.sort(arrS);
        Arrays.sort(arrT);

        // Check if sorted arrays are equal
        return Arrays.equals(arrS, arrT);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String t1 = "silent";
        String s2 = "hello";
        String t2 = "bello";

        System.out.println(isAnagram(s1, t1)); // true
        System.out.println(isAnagram(s2, t2)); // false
    }
}

