package Thread;

import java.util.Vector;

public class ThreadDemo {
    public static void main(String[] args) {
        TicketSaleRunnable runnable = new TicketSaleRunnable();
        Thread t1 = new Thread(runnable, "1号窗口");
        Thread t2 = new Thread(runnable, "2号窗口");
        Thread t3 = new Thread(runnable, "3号窗口");

        t1.start();
        t2.start();
        t3.start();

    }
}
class ThreadTest extends Thread{
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"..."+i);
        }
    }
}


class RunnableTest implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"..."+i);
        }
    }
}

class DemoRunnable implements Runnable{
    private int ticket=100;
    Object obj = new Object();  //相当于传入的对象锁
    public void run(){
        while(true){
            synchronized(obj){
                if(ticket>0){
                    try{
                        Thread.sleep(10);
                    }catch(Exception e){}
                    System.out.println(Thread.currentThread().getName()+"--售票："+ticket--);
                }else{
                    System.exit(1);
                }
            }
        }
    }
}
class TicketSaleRunnable implements Runnable {

    private int tickets = 10; //总票数10张

    public void run() {
        while(true) {
            if(tickets > 0) {
                tickets--;
                Thread.yield(); //让出线程，增加出错几率
                System.out.println(
                        Thread.currentThread().getName() + "，剩余票数：" + tickets);
            }else {
                break;
            }
        }
    }

}