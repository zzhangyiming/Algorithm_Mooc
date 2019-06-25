package Stack;

public class test {

    public static void  main(String[] args){
        ArrayStack<String> stack = new ArrayStack<>();
        stack.push("ming");
        stack.push("yi");
        stack.push("zhang");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
