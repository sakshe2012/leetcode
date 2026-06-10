/*
387. First Unique Character in a String
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:

Input: s = "leetcode"

Output: 0

Explanation:

The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:

Input: s = "loveleetcode"

Output: 2

Example 3:

Input: s = "aabb"

Output: -1
*/


class Solution26 {
    public int firstUniqChar(String s) {
        Map<Character ,Integer> map =  new HashMap <Character ,Integer>();
        for(int i = 0;i< s.length() ;i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch ,map.get(ch)  + 1);
            }
            else
            {
                map.put(ch , 1);

            }
        }
        
        for( int i = 0 ;i< s.length() ;i++)
        {
            char ch = s.charAt(i);
            if(map.get(ch) == 1)
            {
                return i;
            }
        }
        return -1;
    }
}