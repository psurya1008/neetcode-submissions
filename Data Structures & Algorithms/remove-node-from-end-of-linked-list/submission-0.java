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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode curr=head;
        while(curr!=null){
            length+=1;
            curr=curr.next;
        }
        if(n>length){
            return null;
        }
        if(length==1){
            return null;
        }
        int NodeIndexToBeRemoved=length-n+1;
        if(NodeIndexToBeRemoved==1){
            return head.next;
        }
        ListNode curr2=head;
        for(int i=1;i<NodeIndexToBeRemoved-1;i++){
            curr2=curr2.next;
        }
        if(curr2.next.next==null){
            curr2.next=null;
        }
        else{
            curr2.next=curr2.next.next;
        }
        return head; 
    }
}
