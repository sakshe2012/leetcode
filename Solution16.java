/*206. Reverse Linked List
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Input: head = [1,2]
Output: [2,1]
*/

class Solution16 {
    public ListNode reverseList(ListNode head) {
        if(head == null)
        {
            return head;
        }
        ListNode previous = null ;
        ListNode current = head;
        ListNode  next = current.next;
        while(current!= null)
        {
            current.next = previous;
            previous = current;
            current = next;
            if(next != null)
            {
                next = current.next;
            }
        }
        head = previous;
        return head;
        
    }
}