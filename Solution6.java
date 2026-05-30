/*
709. To Lower Case
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"
*/

class Solution6 {
    public String toLowerCase(String s) {
        // return s.toLowerCase(); using inbuild fucntion
        char[] c = s.toCharArray();
        for(int i = 0;i<c.length ;i++)
        {
            if(c[i] >= 65 && c[i] <=90)// uppercase
            {
                c[i] = (char ) (c[i] + 32); // converting ASCII into character

            }
            
        }
        return String.valueOf(c);
    }
}