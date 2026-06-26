/*

1221. Split a String in Balanced Strings

Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

Example 2:
Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
*/


class Solution39 {
    public int balancedStringSplit(String s) {
        if(s== null|| s.length() == 0)
        {
            return 0;
        }
        int left= 0 ,right= 0,count=0;
        for(int i =0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == 'L')
            {
                left++;
            }
            else
            {
                right++;
            }
            if(left == right)
            {
                count++;

            }
        }
        return count;
        
    }
}