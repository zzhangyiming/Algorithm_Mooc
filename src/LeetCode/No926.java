package LeetCode;

import java.util.Stack;

public class No926 {
        public int minFlipsMonoIncr(String S) {
            if(S.length() < 2)
                return 0;
            int zero = 0,one= 0;
            for(int i = 0; i < S.length(); i++){
                String s = String.valueOf(S.charAt(i)) ;
                if(s.equals("1")){
                    zero = zero + 1;
                    one = Math.min(zero-1,one);
                }else{
                    one = Math.min(zero,one) + 1;
                }

            }
            return Math.min(zero, one);
        }

}
