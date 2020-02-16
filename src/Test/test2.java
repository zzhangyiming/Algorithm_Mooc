package Test;

import Arrays.Array;
import Ming.MySort.Tool;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        System.out.println((new test2()).minWindow("abvbsfsdgsdhdshdsff","abf"));

    }
    public String minWindow(String s, String t) {
        if(s.length() < t.length() ){return ""; }
//        if(s.length() == t.length()){
//            if(s.equals(t)){return t;}else{return "";}}
        int[] ft = new int[256];
        StringBuilder str = new StringBuilder();
        int[] nums = new int[s.length()];
        for(int i = 0; i < t.length(); i++){
            ft[t.charAt(i)] ++;
        }
        Tool.printf(ft);
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(ft[s.charAt(i)] != 0){
                str.append(String.valueOf(s.charAt(i)));
                nums[j] =i+1;
                j++;
            }
        }
        System.out.println(str);
        Tool.printf(nums);
        List<Integer> list = findAnagrams(str.toString(),t);
        System.out.println(list);
        j = s.length()+1;
        int index = 0;
        for (int i: list) {
            int j1 = nums[i + t.length() - 1] - nums[i] + 1;
            if(j > j1){
                j = j1;
                index  = i;
            }
        }
        System.out.println(index);
        return j == s.length()+1 ? "" : s.substring(nums[index]-1,nums[index+t.length()-1]);

    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.equals("") || s.length() < p.length()) return list;
        int[] hash = new int[256];
        for (int j = 0; j < p.length(); j++) {
            hash[p.charAt(j)]++;
        }
        int count = p.length();
        int left = 0, right = 0;
        while (right < s.length()) {
            if (hash[s.charAt(right++)]-- >= 1) count--;
            if (count == 0) list.add(left);
            if ((right - left) == p.length() && hash[s.charAt(left++)]++ >= 0) count++;
        }
        return list;
    }
}
