package LeetCode;

public class IndexOf {
    public static int strStr(String haystack, String needle) {
        char firstChar = needle.charAt(0);
        boolean flag = true;
        int key = -1;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==firstChar){
                int n =i+1 ;key=i;
                for(int j=1;j<needle.length();j++){
                    if(haystack.charAt(n) != needle.charAt(j)){
                       flag = false;
                       key = -1;
                    }else{
                        key++;
                    }
                }
            }
        }
        return key;
    }
    public static void main(String[] args){
        System.out.print(strStr("zhang","g"));
    }
}
