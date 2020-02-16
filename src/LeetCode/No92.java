package LeetCode;

public class No92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 1; i < m; i++){
            pre = pre.next;
        }
        head = pre.next;
        for(int i = m; i < n; i++){
            ListNode nex = head.next;
            head.next = nex.next;
            nex.next = pre.next;
            pre.next = nex;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head= new ListNode(arr);
        ListNode dummy = head;
        System.out.println(head.toString());

        System.out.println( (new No92()).reverseBetween(head,2,3));
    }
}
