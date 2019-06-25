package Arrays;

public class test {
    public static void main(String[] args){
        Array<String> arr = new Array<>(10);
        arr.add(0,"world");
        arr.add(0,"Hello");
        arr.add(0,"!");
        for(int i =0;i<arr.getSize();i++){
            System.out.println(arr.get(i));
        }
    }
}
