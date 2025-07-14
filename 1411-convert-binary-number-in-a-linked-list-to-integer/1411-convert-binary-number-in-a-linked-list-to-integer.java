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
    public int getDecimalValue(ListNode head) {
        String res="";
        int sum=0;
        while(head!=null)
        {
            res+=head.val;
            head=head.next;
        }
        int b=0;
        int a=2;
        for(int i=res.length()-1;i>=0;i--)
        {
            int val=res.charAt(i)-'0';
            int power=(int)Math.pow(a,b);
            System.out.println("sum:"+sum+" a:"+a+" b:"+b+" val:"+val);
            sum+=power*val;
            b++;
            
        }
        return sum;
    }
}