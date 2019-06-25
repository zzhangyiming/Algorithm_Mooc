package Ming.MySort;

public class Solution {
  public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode midNext = mid.next;
        mid.next = null;
        return mergeSort(sortList(head), sortList(midNext));
    }
    private ListNode getMid(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode slow = head, quick = head;
        while(quick.next != null && quick.next.next != null) {
            slow = slow.next;
            quick = quick.next.next;
        }
        return slow;
    }
    private ListNode mergeSort(ListNode n1, ListNode n2) {
        ListNode preHead = new ListNode(0), cur1 = n1, cur2 = n2, cur = preHead;
        while(cur1 != null && cur2 != null) {
            if(cur1.val < cur2.val) {
                cur.next = cur1;
                cur1 = cur1.next;
            } else {
                cur.next = cur2;
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        cur.next = cur1 == null ? cur2 : cur1;
        return preHead.next;


    }

    public static void main(String[] args){
        int[] arr = {7,3,4,6};
        ListNode head = new ListNode(arr);
        System.out.println(head);
        ListNode res = (new Solution()).sortList(head);
        System.out.println(res);
    }
}