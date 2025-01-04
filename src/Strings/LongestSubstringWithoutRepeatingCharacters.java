package Strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int answer = longestSubstringWithoutRepeatingCharacters(s);
        System.out.println(answer);
    }
    static int longestSubstringWithoutRepeatingCharacters(String s){
        if (s == null || s.isEmpty()) return 0; //Check if string is empty
        if (s.length() == 1) return 1; //check if string is of length 1

        int left = 0;
        int right = 0;
        int ans = 0;

        HashSet<Character> set = new HashSet<>();
        while (right < s.length()){
            char c = s.charAt(right);
            while (set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            ans = Math.max(ans, right-left+1);
            right++;
            }
        return ans;
        }
    }
