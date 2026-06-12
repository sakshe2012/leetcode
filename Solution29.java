/*

520. Detect Capital
We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true

Example 2:
Input: word = "FlaG"
Output: false
*/

class Solution29{
    public boolean detectCapitalUse(String word) {
        if(allCaps(word) || allLower(word) ||  titleCase(word))
        {
            return true;
        }
        return false;
        
    }
    private boolean allCaps(String word)
    {
        int count = 0;
        for(int i = 0;i<word.length() ;i++)
        {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch))
            {
                count++;
            }
        }
        if(word.length() == count)
        {
            return true;
        }
        return false;
    }

    private boolean allLower(String word)
    {
        int count = 0;
        for(int i = 0;i<word.length() ;i++)
        {
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch))
            {
                count++;
            }
        }
        if(word.length() == count)
        {
            return true;
        }
        return false;
    }

    private boolean titleCase(String word){
        char ch= word.charAt(0);
        String sub_str = word.substring(1);
        if((Character.isUpperCase(ch) && allLower(sub_str)))
        {
            return true;
        }
        return false;
    }





}