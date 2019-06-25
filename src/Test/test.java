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
    public static void main(String[] args){

        System.out.println(myPow(4,2));
    }
}
