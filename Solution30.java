/*

557. Reverse Words in a String III
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "Mr Ding"
Output: "rM gniD"
*/

class Solution30 {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ;i<= words.length-2 ;i++){
            String reverseword = reverseEachWord(words[i]);
            sb.append(reverseword + " ");
        }
        String lastword=reverseEachWord(words[words.length-1]);
        sb.append(lastword);
        return sb.toString();
     }
    private static String reverseEachWord(String word)
    {
        String result = "";
        for(int i = word.length()-1 ; i>=0;i--)
        {
            result += word.charAt(i);
        }
        return result;
    }
}
