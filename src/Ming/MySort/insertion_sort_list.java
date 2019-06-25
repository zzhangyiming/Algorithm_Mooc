package Ming.MySort;

import java.util.Vector;

public class insertion_sort_list {
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next ==null)
            return head;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = head.next;
        while(pre!= null){
            ListNode cur = head;
            while(cur.next != pre.next ){
                if(pre.val < cur.val){
                    int temp = pre.val;
                    pre.val = cur.val;
                    cur.val = temp;
                }
                cur = cur.next;
            }
            pre = pre.next;
        }
        return dummyHead.next;
    }
    public static void main(String[] args){
        Vector a = new Vector();

        int[] arr = {7,3,4,6,8,9,1,2,5,0,11,13,12};
        ListNode head = new ListNode(arr);
        System.out.println(head);
        ListNode res = (new insertion_sort_list()).insertionSortList(head);
        System.out.println(res);
    }
}
