/*
1351. Count Negative Numbers in a Sorted Matrix
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

Example 1:
Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.

Example 2:
Input: grid = [[3,2],[1,0]]
Output: 0
 */

class Solution41
{
    public int countNegatives(int[][] grid)
    {
        int result =0;
        for(int[] a : grid)
        {
            result += findNegatives(a);
        }
        return result;
    }
    public int findNegatives(int [] a)
    {
        if(a[0] <0)
        {
            return a.length;
        }
        if(a[a.length -1] >=0) return 0;
        int start=0;
        int end =a.length-1;
        int index=0;
        while(start <= end)
        {
            int mid = start+(end - start)/2;
            if(a[mid]<0)
            {
                index =mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return a.length -index;
    }
}