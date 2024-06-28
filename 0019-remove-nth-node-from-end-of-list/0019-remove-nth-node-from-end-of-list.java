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
        ListNode temp =head;
        int length = length(temp);
        int skip = length-n;
        if(skip == 0){
            return head.next;
        }
        for(int i=0;i<skip-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    public int length(ListNode head){
        int length =0;
        while(head!=null){
            length++;
            head = head.next;
        }
        return length;
    }
}