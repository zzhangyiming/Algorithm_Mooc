package LinkedList;

public class test {

    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.addLast("a");
        linkedList.addLast("b");
        linkedList.addLast("c");
        linkedList.addLast("d");
        System.out.println(linkedList.print());
        linkedList.remove(2);
        System.out.println(linkedList.print());
        linkedList.add(2,"张一鸣太帅了");
        System.out.println(linkedList.print());
        linkedList.removeFirst();
        System.out.println(linkedList.print());
        linkedList.removeLast();
        System.out.println(linkedList.print());
    }
}
