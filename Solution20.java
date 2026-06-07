/*
242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Anagram ====  
Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
*/
class Solution20 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        int count[]  = new int[26];
        for(int i =0;i<s.length() ;i++)
        {
            char ch = s.charAt(i);
            count[ch - 'a']++ ;
        }
        for(int i = 0; i< t.length(); i++)
        {
            char ch =t.charAt(i);
            count[ch - 'a']-- ;
        }
        for(int i =0 ;i< count.length ;i++)
        {
            if(count[i] > 0)
            {
                return false;
            }

        }
        return true;
    }
}












