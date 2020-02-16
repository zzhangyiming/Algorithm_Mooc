package jvm;

public class GCtest {
    private Object instance;

    GCtest(){
        Object[] objects = new Object[1024 *1024 *1];
    }

    public static void main(String[] args) {

        GCtest gc1 = new GCtest();

        GCtest gc2 = new GCtest();

        gc1.instance = gc2;

        gc2.instance = gc1;

        gc1 = null;

        gc2 = null;
        GCtest gc3 = new GCtest();
    }


}
