package LinkedList;

public class LinkedList<E> {
    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e,null);
        }

        public Node(){
            this(null,null);
        }
    }
    private Node dummyHead;
    private int size;

    public LinkedList(){
        dummyHead = new Node(null,null);
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public  boolean isEmpty(){
        return size==0;
    }

    public void addFirst(E e){
        add(0,e);
    }

    public void addLast(E e){
        add(size, e);
    }

    public void add(int index, E e){
        if(index < 0 || index > size)
            throw new IllegalArgumentException("out of the range.");

        Node prev = dummyHead;
        for(int i = 0; i < index ; i++){
            prev = prev.next;
        }
//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;
        prev.next = new Node(e,prev.next);

        size++;
    }

    public E get(int index){
        if(index < 0 || index > size)
            throw new IllegalArgumentException("out of the range.");
        Node cur = dummyHead.next;
        for(int i = 0; i < index ;i++){
            cur = cur.next;
        }
        return cur.e;
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size-1);
    }

    public void set(int index, E e){
        if(index < 0 || index > size)
            throw new IllegalArgumentException("out of the range.");
        Node cur = dummyHead.next;
        for(int i = 0; i < index ;i++){
            cur = cur.next;
        }
        cur.e = e;
    }

    public boolean find(E e){
        Node cur = dummyHead.next;
        while(cur != null){
            if(cur.e == e){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public String print() {
        StringBuilder s = new StringBuilder();
        Node cur = dummyHead.next;
        while(cur != null){
            s.append(cur.e + "->");
            cur = cur.next;
        }
        s.append("NULL");
        return s.toString();
    }

}
