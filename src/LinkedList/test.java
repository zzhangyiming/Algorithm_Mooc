package LinkedList;

public class test {

    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.addLast("a");
        linkedList.addLast("b");
        linkedList.addLast("c");
        linkedList.addLast("d");

        System.out.println(linkedList.print());
    }
}
