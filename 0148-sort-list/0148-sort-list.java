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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> ans=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            ans.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(ans);
        ListNode res=new ListNode(0);
        ListNode t=res;
        for(int i:ans)
        {
            System.out.print(i+" ");
            t.next=new ListNode(i);
            t=t.next;
            
        }
        return res.next;
    }
}