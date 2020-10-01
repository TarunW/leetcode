package day1;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int maxLen = s.length() <= 1 ? s.length() : 1;
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (!set.add(ch)) {
                maxLen = set.size() > maxLen ? set.size() : maxLen;
                set.clear();
                set.add(ch);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println("lengthOfLongestSubstring(\"abcabcbb\") = " + lengthOfLongestSubstring("q"));
    }
}

