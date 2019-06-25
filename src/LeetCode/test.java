package LeetCode;


import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args){
        List list = new ArrayList();
        for(int i = 1;i<=10;i++){
            list.add(i);
        }
        int n = 0;
        int s= list.size();
        while(list.size()>2){
            n+=2;
            if(n>list.size()){
                n = s-(s%3) - s;
                n+=2;
            }
            if(n<list.size())
                list.remove(n);
                 s = list.size();
            for(Object object : list){
                System.out.print(object+" ");
            }
            System.out.println();
        }
    }
}
