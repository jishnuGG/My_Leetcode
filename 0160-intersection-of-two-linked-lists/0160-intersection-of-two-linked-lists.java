/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=0;
        int len2=0;
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null) {len1++;temp1=temp1.next;}
        while(temp2!=null) {len2++;temp2=temp2.next;}
        System.out.print(len1+" "+len2);
        int diff=Math.abs(len1-len2);
        if(len2>len1)
        {
            ListNode temp=headB;int i=0;
            while(i<diff)
            {
                temp=temp.next;
                i++;
            }
            ListNode dummy=headA;
            while(temp!=null && dummy!=null)
            {
                if(temp==dummy && temp.val==dummy.val) return temp;
                temp=temp.next;
                dummy=dummy.next;
            }
        }

        else
        {
            ListNode temp=headA;int i=0;
            while(i<diff)
            {
                temp=temp.next;
                i++;
            }
            ListNode dummy=headB;
            while(temp!=null && dummy!=null)
            {
                if(temp==dummy && temp.val==dummy.val) return temp;
                temp=temp.next;
                dummy=dummy.next;
            }
        }
        return null;
    }
}