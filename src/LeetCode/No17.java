package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class No17 {
    public static List<String> letterCombinations(String digits) {
        int[] arr = new int[digits.length()];
        String[] dictionary ={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.equals("")) return new ArrayList<>();
        int n = digits.length();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < n ;i+=2){
            List<String> b1 = buttonChar(String.valueOf(digits.charAt(i)),dictionary);
            if(n==1){
                return b1;
            }else if(n%2==1 && i==n-1){
                return perm(list,b1);
            }else
                list = perm(list,b1);
            List<String> b2 = buttonChar(String.valueOf(digits.charAt(i+1)),dictionary);
            if(list.isEmpty())
                list = perm(b1,b2);
            else
                list = perm(list,b2);
        }
        return list;
    }
    public static List<String> buttonChar (String digits,String[] dictionary){
        List<String> list = new ArrayList<>();
        int index = Integer.parseInt(digits)-2;
        for(int i = 0;i<dictionary[index].length();i++){
            list.add(String.valueOf(dictionary[index].charAt(i)));
        }
        return list;
    }
    public static List<String> perm(List<String> list1, List<String> list2){
        List<String> list = new ArrayList<>();
        for(int i = 0; i< list1.size(); i++){
            for(int j = 0; j< list2.size() ;j++){
                String l = list1.get(i) + list2.get(j);
                if(!list.contains(l))
                   list.add(l);
            }
        }
        return list;
    }
    public static void main(String[] args){
        System.out.println(letterCombinations("2345"));
    }
}
