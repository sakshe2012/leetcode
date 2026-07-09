/*
3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without duplicate characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
class Solution50 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // If character already exists in current window
            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }

            
            map.put(ch, right);

           
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}