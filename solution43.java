
/*
1161. Maximum Level Sum of a Binary Tree
Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.

Return the smallest level x such that the sum of all the values of nodes at level x is maximal.

Example 1:
Input: root = [1,7,0,7,-8,null,null]
Output: 2
Explanation: 
Level 1 sum = 1.
Level 2 sum = 7 + 0 = 7.
Level 3 sum = 7 + -8 = -1.
So we return the level with the maximum sum which is level 2.
Example 2:

Input: root = [989,null,10250,98693,-89388,null,null,null,-32127]
Output: 2
*/


class Solution43{
    public int maxLevelSum(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        Queue<TreeNode>queue = new LinkedList<>();
        queue.offer(root);
        int level=0;
        int bestLevel = 1;
        int bestSum=Integer.MIN_VALUE;
        while(!queue.isEmpty())
        {
            level++;
            int size=queue.size();
            int currsum = 0;
            for(int i =0;i<size;i++)
            {
                TreeNode node = queue.poll();
                currsum +=node.val;
                if(node.left!= null)
                {
                    queue.offer(node.left);
                }
                if(node.right != null)
                {
                    queue.offer(node.right);
                }
            }
            if(currsum > bestSum)
            {
                bestSum = currsum;
                bestLevel = level;
            }
        }
        return bestLevel;
    }
}