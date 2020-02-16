package Thread;

public class SyncThread implements Runnable {
    private static int count;
 
    public SyncThread() {
        count = 0;
    }
 
    @Override
    public  void run() {
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
 
    public static void main(String[] args) {
        SyncThread s1 = new SyncThread();
        SyncThread s2 = new SyncThread();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);

        t1.start();
        t2.start();


    }
}
