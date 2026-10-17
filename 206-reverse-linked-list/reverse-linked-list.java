/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */
import java.util.*;
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        Stack<ListNode> st =new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
        }

        ListNode ptr=st.pop();
        head=ptr;
        while(!st.isEmpty()){
            ptr.next=st.pop();
            ptr=ptr.next;
        }
        ptr.next=null;
        return head;
        
    }
}