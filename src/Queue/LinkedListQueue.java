package Queue;

public class LinkedListQueue<E> implements Queue<E> {
    class Node{
        private E e;
        private Node next;

        public Node(E e,Node next){
            this.e = e;
            this.next = next;
        }
        public Node(E e){
            this(e, null);
        }
        public Node(){
            this(null,null);
        }
        @Override
        public  String toString(){
            return e.toString();
        }
    }

    private Node head,tail;
    private int size;

    public LinkedListQueue(){
        head = null;
        tail = null;
        size = 0;
    }



    @Override
    public void enqueue(E e) {
        if(tail == null){
            tail = new Node(e);
            head = tail;
        }else{
            tail.next = new Node(e);
            tail = tail.next;
        }
        size ++;
    }

    @Override
    public E dequeue() {
        if(isEmpty())
            throw new IllegalArgumentException("Queue is empty.");

        Node retNode = head;
        head = head.next;
        retNode.next = null;
        if(head == null )
            tail = null;
        size --;
        return retNode.e;
    }

    @Override
    public E getFront() {
        if(isEmpty())
            throw new IllegalArgumentException("Queue is empty.");
        return head.e;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Queue: front ");
        Node cur = head;
        while(cur != null){
            s.append(cur.e + "->");
            cur = cur.next;
        }
        s.append("NULL tail");
        return s.toString();
    }
}
