package Strings;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int result = characterReplacement(s, k);
        System.out.println(result); // Output: 4
    }

    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26]; // Frequency array for characters 'A' to 'Z'
        int maxCount = 0; // Maximum frequency of any character in the current window
        int maxLength = 0; // Maximum length of valid substring
        int start = 0; // Start index of the sliding window

        for (int end = 0; end < s.length(); end++) {
            // Increment frequency of the current character
            freq[s.charAt(end) - 'A']++;

            // Update maxCount to be the highest frequency in the window
            maxCount = Math.max(maxCount, freq[s.charAt(end) - 'A']);

            // Check if the window is valid
            while ((end - start + 1) - maxCount > k) {
                // Shrink the window from the start
                freq[s.charAt(start) - 'A']--;
                start++;
            }

            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
