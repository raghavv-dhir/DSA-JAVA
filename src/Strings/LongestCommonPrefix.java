package Strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String ans = solution(strs);
        System.out.println(ans);
    }
    static String solution(String[] strs){
        if(strs == null || strs.length == 0) return "";
        //Start with the first string in the array as initial prefix
        String prefix = strs[0];

        //Compare the current prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            //Narrow down the prefix with each comparison
            while (strs[i].indexOf(prefix) != 0){
                //Shorten the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length()-1);

                //If the prefix becomes empty, there is no common prefix
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
