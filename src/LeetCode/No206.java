package LeetCode;

public class No206 {
    ListNode Reverse(ListNode head){
        if(head.next == null)
            return head;
        ListNode cur = head;
        ListNode pre = head.next;

        while(pre!=null){
            cur.next = pre.next;
            ListNode help = pre.next;
            pre.next = head;
            head = pre;
            pre = help;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head= new ListNode(arr);
        ListNode dummy = head;
        System.out.println(head.toString());

        System.out.println( (new No206()).Reverse(head));
    }
}
