package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class UnsafeTest {

    public static void main(String[] args) throws InterruptedException {
        final List<Integer> list = new Vector<Integer>();


        new Thread(new Runnable(){

            public void run() {
                for(int i = 0; i < 100; i++) {
                    list.add(i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            
        }).start();
        
        new Thread(new Runnable() {
            
            public void run() {
                for(int i = 100; i < 200; i++){
                    list.add(i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        
         Thread.sleep(10000);
         
          // 打印所有结果
          for (int i = 0; i < list.size(); i++) {
              System.out.println("第" + (i) + "号元素为：" + list.get(i));
          }
    }
}