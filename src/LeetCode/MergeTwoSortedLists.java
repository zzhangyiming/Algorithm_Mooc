package LeetCode;

import Ming.MySort.QuickSort;
import Ming.MySort.Tool;

public class MergeTwoSortedLists {
    /**
     * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
     *
     * Example:
     *
     * Input: 1->2->4, 1->3->4
     * Output: 1->1->2->3->4->4
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        else if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;

        ListNode p1 = l1, p2 = l2;
        ListNode p, head;
        if (p1.val <= p2.val) {
            head = p = p1;
            p1 = p1.next;
        } else {
            head = p = p2;
            p2 = p2.next;
        }

        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                p.next = p1;
                p = p.next;
                p1 = p1.next;
            } else {
                p.next = p2;
                p = p.next;
                p2 = p2.next;
            }
        }

        if (p1 == null)
            p.next = p2;
        else
            p.next = p1;
        return head;

    }

    public static void main(String[] args){
        int[] arr1 = Tool.CreatArray(1,20,5);
        int[] arr2 = Tool.CreatArray(1,20,5);
        QuickSort.sort(arr1);
        QuickSort.sort(arr2);
        ListNode l1 = new ListNode(arr1);
        ListNode l2 = new ListNode(arr2);
        Tool.printf(arr1);
        Tool.printf(arr2);
       System.out.println(mergeTwoLists(l1,l2).toString());
    }
}
