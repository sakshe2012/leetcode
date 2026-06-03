/*
125. Valid Palindrome
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

*/
class Solution12 {
    public static boolean checkPalindrome(String s)
    {
        int left = 0;
        int right =s.length() - 1;
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int  i = 0; i< s.length() ;i++)
        {
            char ch =s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch))
            {
                sb.append(ch);
            }
        }
        String result = sb.toString();
        result = result.toLowerCase();
        if(checkPalindrome(result))
        {
            return true;
        }
        return false;
        
    }
}