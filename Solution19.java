/*

234.palindrom linked list
true-- list is palindrome
false - list is not palindroe

*/

class Solution19 {
    public boolean isPalindrome(ListNode head) {
       if(head == null)
       {
        return true;
       } 
       List<Integer >list = new ArrayList<>();
       ListNode current = head;
       while(current != null)
       {
        list.add(current.val);
        current=current.next;
       }
       int left =0;
       int right  = list.size() -1 ;
       while(left < right)
       {
        if(list.get(left) != list.get(right))
        {
            return false;
        }
        left++;
        right--;
       }
       return true;
    }
}