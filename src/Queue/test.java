package Queue;

import LinkedList.LinkedList;

public class test {

    public static void main(String[] args){
        LinkedListQueue<String> queue = new LinkedListQueue<String>();
        queue.enqueue("张一鸣");
        queue.enqueue("大帅哥");
        queue.enqueue("大帅逼");

        queue.dequeue();
        System.out.println(queue.toString());
    }
}
