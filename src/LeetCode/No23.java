package LeetCode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class No23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        if(lists.length==1){
            return lists[0];
        }
        int n = lists.length -1;
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        if(lists.length == 1)
            return lists[0];
        if(lists.length == 2){
            return m.mergeTwoLists(lists[0],lists[1]);
        }

        int mid = lists.length/2;
        ListNode[] l1 = new ListNode[mid];
        for(int i = 0; i < mid; i++){
            l1[i] = lists[i];
        }

        ListNode[] l2 = new ListNode[lists.length-mid];
        for(int i = mid,j=0; i < lists.length; i++,j++){
            l2[j] = lists[i];
        }

        return m.mergeTwoLists(mergeKLists(l1),mergeKLists(l2));

    }


}
