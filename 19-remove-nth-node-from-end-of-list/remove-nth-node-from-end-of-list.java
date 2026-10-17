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

        int m=0;
        ListNode temp=head;
        while(temp!=null){
            m++;
            temp=temp.next;
        }
        if(m==n){
            return head.next;
        }
        ListNode ptr=head;
        for(int i=0;i<m-n-1;i++){
ptr=ptr.next;

        }
        ptr.next=ptr.next.next;
        return head;
        
    }
}