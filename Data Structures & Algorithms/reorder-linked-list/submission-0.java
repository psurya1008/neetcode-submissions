/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {

    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode curr=head;
        ListNode ptr1=head;
        ListNode ptr2=head.next;

        while(ptr2!=null&&ptr2.next!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next.next;
        }
        ListNode ptr3=ptr1.next;
        ptr1.next=null;
        ListNode insertList=reverse(ptr3);
        ListNode next,next2;
        while(insertList!=null){
            next=insertList.next;
            next2=curr.next;
            insertList.next=next2;
            curr.next=insertList;
            insertList=next;
            curr=next2;
        }
    }
}
