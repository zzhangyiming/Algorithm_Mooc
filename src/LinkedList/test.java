package LinkedList;

public class test {

    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.addLast("a");
        linkedList.addLast("b");
        linkedList.addLast("c");
        linkedList.addLast("d");
        linkedList.set(1,"张一鸣");
        linkedList.addFirst("超级帅");
        System.out.println(linkedList.print());
    }
}
