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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curl=head;
        int count=0;
        while(curl!=null && count<k){
            curl=curl.next;
            count++;
        }
        if(count<k){
            return head;
        }
        curl=head;
        ListNode prev=null;
        ListNode temp=null;
        for(int i=0;i<k;i++){
            temp=curl.next;
            curl.next=prev;
            prev=curl;
            curl=temp;
        }
        if(prev!=null){
             head.next = reverseKGroup(temp, k);
        }
        return prev;
    }
}