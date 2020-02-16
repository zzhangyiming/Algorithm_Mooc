package Test;

import Ming.MySort.Tool;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static double myPow(double x, int n) {
        double res = 1.0;
        for(int i = n ;i != 0; i/=2){
            if(i %2 != 0){
                res *= x;
            }
            x *= x;
            System.out.println(res+"  "+x);
        }
        return n <0 ? 1/res : res;

    }
    public String replaceSpace(String s) {
        StringBuffer str = new StringBuffer("");
        for(int i = 0 ;i < s.length(); i++){
            if(s.charAt(i) == ' '){
                str.append("%20");
            }else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }


    public static void main(String[] args){
       int[] arr = new int[4];

    }
}
