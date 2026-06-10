/*
383. Ransom Note
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
 */

class Solution25 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character ,Integer> map = new HashMap<>();
        for(int i =0; i<magazine.length() ;i++)
        {
            if(map.containsKey(magazine.charAt(i)))
            {
                map.put(magazine.charAt(i) ,map.get(magazine.charAt(i))+1);
            }
            else
            {
                map.put(magazine.charAt(i) ,1);
            }
        }
        int count = 0;
        for(int i =0 ;i < ransomNote.length() ;i++)
        {
            char ch = ransomNote.charAt(i);
            if(map.containsKey(ch) && map.get(ch) > 0)
            {
                count++ ;
                map.put(ch , map.get(ch) - 1);
            }
            else
            {
                break;
            }
        }
        if(count == ransomNote.length())
        {
            return true;
        }
        return false;
        
    }
}