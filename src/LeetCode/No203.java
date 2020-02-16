package LeetCode;

public class No203 {
    public   ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prev = dummyHead;
        while(prev.next != null){
            if(prev.next.val ==val ){
              prev.next = prev.next.next;
            }else{
                prev = prev.next;
            }
        }

        return head;
    }

    public ListNode removeElements2(ListNode head, int val) {
        if(head == null)
            return null;
        head.next = removeElements2(head.next,val);
        return head.val == val ?  head.next : head;
    }


    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,1,2,4,5,8,6,8,9,1,3,65};
        ListNode node = new ListNode(arr);
        System.out.println(node.toString());
        (new No203()).removeElements(node,2);
        (new No203()).removeElements2(node,5);
        System.out.println(node.toString());
    }
}
