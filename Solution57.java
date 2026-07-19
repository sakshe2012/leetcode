/*
179. Largest Number

Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

 

Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"

*/
class Solution57{
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];

        // Convert integers to strings
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Sort using custom comparator
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // If the largest element is "0", return "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        // Build the answer
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }
}